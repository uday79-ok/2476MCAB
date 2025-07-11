from django.db import models

class Faculty(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)
    department = models.CharField(max_length=50)
    joining_date = models.DateField()

    def __str__(self):
        return f'{self.first_name} {self.last_name}'