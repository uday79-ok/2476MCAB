from django.shortcuts import render, redirect, get_object_or_404
from .models import Item, CartItem, Order
from .forms import CartItemForm
from django.contrib.auth.decorators import login_required
from django.db.models import Sum, Q

def home(request):
    items = Item.objects.all()
    query = request.GET.get('q')
    if query:
        items = items.filter(Q(name__icontains=query) | Q(description__icontains=query))
    return render(request, 'canteen/home.html', {'items': items})

@login_required
def add_to_cart(request, item_id):
    item = get_object_or_404(Item, id=item_id)
    cart_item, created = CartItem.objects.get_or_create(user=request.user, item=item)
    cart_item.quantity += 1
    cart_item.save()
    return redirect('cart')

@login_required
def cart(request):
    cart_items = CartItem.objects.filter(user=request.user)
    total = sum(item.item.price * item.quantity for item in cart_items)
    return render(request, 'canteen/cart.html', {'cart_items': cart_items, 'total': total})

@login_required
def checkout(request):
    cart_items = CartItem.objects.filter(user=request.user)
    total = sum(item.item.price * item.quantity for item in cart_items)
    order = Order.objects.create(user=request.user, total=total, paid=True)
    order.items.set(cart_items)
    order.save()
    cart_items.delete()
    return render(request, 'canteen/checkout.html', {'order': order})

@login_required
def history(request):
    orders = Order.objects.filter(user=request.user).order_by('-created_on')
    return render(request, 'canteen/history.html', {'orders': orders})