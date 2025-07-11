from django.urls import path
from .views import FacultyCreateView
from .views import FacultyListView
from .views import FacultyUpdateView
from .views import FacultyDeleteView

urlpatterns = [
    path('faculty/', FacultyListView.as_view(), name='faculty_list'),
    path('faculty/create/', FacultyCreateView.as_view(), name='faculty_create'),
    path('faculty/update/<int:pk>/', FacultyUpdateView.as_view(), name='faculty_update'),
    path('faculty/delete/<int:pk>/', FacultyDeleteView.as_view(), name='faculty_delete'),
]