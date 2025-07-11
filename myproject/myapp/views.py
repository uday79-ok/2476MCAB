from django.shortcuts import render
from django.views.generic.edit import CreateView
from django.views.generic import UpdateView
from django.views.generic import DeleteView
from django.views.generic import ListView
from django.urls import reverse_lazy
from .models import Faculty

# Create Faculty View
class FacultyCreateView(CreateView):
    model = Faculty
    fields = ['first_name', 'last_name', 'department', 'joining_date']
    template_name = 'faculty_form.html'  # Optional: specify custom template
    success_url = reverse_lazy('faculty_list')

# List Faculty View
class FacultyListView(ListView):
    model = Faculty
    context_object_name = 'faculties'  # Optional: specify the context variable name in templates
    template_name = 'faculty_list.html'  # Optional: specify custom template

# Update Faculty View
class FacultyUpdateView(UpdateView):
    model = Faculty
    fields = ['first_name', 'last_name', 'department', 'joining_date']
    template_name = 'faculty_form.html'  # Optional: specify custom template
    success_url = reverse_lazy('faculty_list')

# Delete Faculty View
class FacultyDeleteView(DeleteView):
    model = Faculty
    template_name = 'faculty_confirm_delete.html'  # Optional: specify custom template
    success_url = reverse_lazy('faculty_list')