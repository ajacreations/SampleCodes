# Generated by Django 3.2.9 on 2022-06-13 17:35

from django.conf import settings
import django.contrib.auth.models
from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        migrations.swappable_dependency(settings.AUTH_USER_MODEL),
        ('todolist', '0014_task_person'),
    ]

    operations = [
        migrations.AlterField(
            model_name='task',
            name='person',
            field=models.ForeignKey(blank=True, default=django.contrib.auth.models.User, on_delete=django.db.models.deletion.CASCADE, to=settings.AUTH_USER_MODEL),
        ),
    ]