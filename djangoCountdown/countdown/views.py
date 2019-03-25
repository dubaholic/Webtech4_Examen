from django.shortcuts import render
import datetime
from datetime import timedelta

# Create your views here.

def index(request):
    timeLocal = datetime.datetime.now()
    timeBrexit = datetime.datetime(2019, 3, 29, 23,00,00)
    diff = timeBrexit - timeLocal
    days, seconds = diff.days, diff.seconds
    hours = days * 24 + seconds // 3600
    minutes = (seconds % 3600) // 60
    seconds = seconds % 60
    print(hours)
    
    print(timeBrexit)
    print(timeLocal)
    return render(request, 'countdown/index.html', {'hours': hours, 'minutes': minutes, 'seconds': seconds})