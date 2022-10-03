from django.db import models
from django.conf import settings
from django.contrib.auth.models import User


class Task(models.Model):
    task=models.CharField(max_length=40,null=True,default=None)
    desc=models.CharField(max_length=50,null=True,default=None)
    time=models.DateField(auto_now_add=True)
    due=models.DateField(auto_now_add=False,default=None)
    status=models.CharField(max_length=20,  default='Open')
    person=models.ForeignKey( User, on_delete=models.CASCADE,null=False,default=User.get_username)
 
    



    