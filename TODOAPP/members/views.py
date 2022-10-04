from django.shortcuts import render,redirect
from django.contrib.auth import authenticate, login,logout
from django.contrib import messages
#imports for user creation form
from django.contrib.auth.forms import UserCreationForm
from django.contrib.auth.models import User
# Create your views here.
def works(request):
    if(request.method=='POST'):
        username = request.POST['username']
        password = request.POST['pass']
        user = authenticate(request, username=username, password=password)
        if user is not None:
            login(request, user)
            return redirect("main")

        else:
            # Return an 'invalid login' error message.
            return render(request,"mem/login_page.html")

    return render(request,"mem/login_page.html")

def nowork(request):
    logout(request)
    return redirect("main")

def register_user(request):
    if(request.method=='POST'):
        form=UserCreationForm(request.POST)
        if form.is_valid():
            form.save
            username=form.cleaned_data['username']
            password=form.cleaned_data['password1']
            user = User.objects.create_user(username=username, password=password)
            user.save()
            #user = authenticate(request, username=username, password=password)
            login(request, user)
            messages.error(request, 'User creater and logged-in')
            return redirect("main")
        else:
            messages.error(request, 'Some error')
            return redirect("register-user")

        
    else:
        form=UserCreationForm()
        return render(request,"mem/reg_user.html",{'form':form,})

    