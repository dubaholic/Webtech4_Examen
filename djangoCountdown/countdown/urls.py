from django.urls import path
from . import views

app_name = 'countdown'
#als de gebruiker naar 'quotes/' 1 van volgende zaken surft dan worden deze urls aangeroepen
urlpatterns = [
	path('', views.index, name='index'),
	path('search/quotes', views.search_quotes, name='search_quotes'),
	path('search/form', views.search_form, name='search_form'),
	#hierbij wordt ook de author_name meegegeven met de methode van de view
	path('<str:author_name>/', views.detail, name='detail'),
]