from django.shortcuts import render, redirect
from django.contrib.auth import authenticate, login
from .models import Product
from .forms import LoginForm
import qrcode
from io import BytesIO
from django.http import HttpResponse

def home(request):
    return render(request, 'home.html')

def product_list(request):
    products = Product.objects.all()
    return render(request, 'product_list.html', {'products': products})

def login_view(request):
    if request.method == 'POST':
        form = LoginForm(request.POST)
        if form.is_valid():
            user = authenticate(
                request,
                username=form.cleaned_data['username'],
                password=form.cleaned_data['password']
            )
            if user:
                login(request, user)
                return redirect('product_list')
    else:
        form = LoginForm()
    return render(request, 'login.html', {'form': form})

# Payment QR Code Generation
def generate_payment_qr(request):
    upi_id = "yourupiid@upi"  # Replace with actual UPI ID
    name = "Mother Theresa Canteen"
    amount = "50.00"
    upi_url = f"upi://pay?pa={upi_id}&pn={name}&am={amount}&cu=INR"

    qr = qrcode.make(upi_url)
    buffer = BytesIO()
    qr.save(buffer, format="PNG")
    buffer.seek(0)
    return HttpResponse(buffer.getvalue(), content_type="image/png")

def payment_page(request):
    return render(request, 'payment.html')

from django.contrib.auth.decorators import login_required
from django.contrib import messages

@login_required
def add_to_cart(request, product_id):
    product = Product.objects.get(id=product_id)
    cart_item, created = CartItem.objects.get_or_create(user=request.user, product=product)
    if not created:
        cart_item.quantity += 1
        cart_item.save()
    messages.success(request, f'Added {product.name} to your cart.')
    return redirect('product_list')


@login_required
def view_cart(request):
    cart_items = CartItem.objects.filter(user=request.user)
    total = sum(item.get_total_price() for item in cart_items)
    return render(request, 'cart.html', {'cart_items': cart_items, 'total': total})


@login_required
def remove_from_cart(request, cart_item_id):
    cart_item = CartItem.objects.get(id=cart_item_id, user=request.user)
    cart_item.delete()
    messages.success(request, "Item removed from cart.")
    return redirect('view_cart')


@login_required
def checkout(request):
    cart_items = CartItem.objects.filter(user=request.user)
    if not cart_items:
        messages.info(request, "Your cart is empty!")
        return redirect('product_list')

    total = sum(item.get_total_price() for item in cart_items)

    if request.method == 'POST':
        order = Order.objects.create(user=request.user, total_amount=total, paid=False)
        for item in cart_items:
            OrderItem.objects.create(
                order=order,
                product=item.product,
                quantity=item.quantity,
                price=item.product.price
            )
        cart_items.delete()
        messages.success(request, f"Order #{order.id} placed! Please pay ₹{total}.")
        return redirect('payment_page')

    return render(request, 'checkout.html', {'cart_items': cart_items, 'total': total})
