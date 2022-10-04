from django.urls import path
from . import views

urlpatterns = [
    path('home',views.home,name='home'),
    path('task',views.task,name='task'),
    path('del_task/<task_id>',views.deltask,name='del-task'),
    path('update_task/<task_id>',views.update_task,name='update-task'),
    path('',views.main,name='main'),
    
]