import re
from django.shortcuts import render,redirect
from todolist.models import Task
from django.contrib import messages


# Create your views here.

def home(request):
    if(request.method=='POST'):
        atask=request.POST['atask']
        desc=request.POST['desc']
        due=request.POST['due_date']
        status=request.POST['status']
        person=request.user
        ins=Task(task=atask , desc=desc,person=person,due=due,status=status)
        ins.save()
        messages.error(request, 'Task Added successfully')
        return redirect('main')
    return render(request,'home.html')

def task(request):
    
    allTask=Task.objects.all()
    context={'tasks':allTask}
    return render(request,'task.html',context)

def deltask(request,task_id): 
    task = Task.objects.get(pk=task_id)
    task.delete()
    messages.error(request, 'Task Deleted')
    return redirect('main')

def main(request):
    allTask=Task.objects.all()
    context={'tasks':allTask}
    return render(request,'main.html',context)

def update_task(request,task_id): 
    if(request.method=='POST'):
        task = Task.objects.get(pk=task_id)
        task.task=request.POST['atask']
        task.desc=request.POST['desc']
        task.due=request.POST['due_date']
        task.status=request.POST['status']
        task.save()
        messages.error(request, 'Task Updated successfully')
        return redirect('main')
    task = Task.objects.get(pk=task_id)
    return render(request,'update.html',{'task':task})