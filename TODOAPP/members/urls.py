from django.urls import path
from . import views

urlpatterns = [
    path('',views.works,name='works'),
    path('logout',views.nowork,name='no_more_work'),
    path('register',views.register_user,name='register-user'),
    
]