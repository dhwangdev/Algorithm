<1> Install pipenv
powershell에서 
pip install --user pipenv
* need to add python to path first!!

<2> create folder
1. cd (path to folder)
2. (folder) pipenv --three (create virtual environment)
3. code .

(VS Code terminal)
1. pipenv shell (activate virtual environment)
2. pipenv install Django==(버전)
(그냥 Django는 최신 버전)
3. django-admin (to check if everything has been installed correctly)

<3> Github
1. Make new repo
=====================
DOWNLOAD GIT & CONFIGURE THE SETTINGS
=====================
2. Copy URL of new repo -> VS Code terminal:
-1. git init
-2. git remote add origin (URL)
-3. git add . 
-4. git commit -m "내용"
-5. touch README.md (git bash로 해야함. windows powershell로는 안됨)
-6. touch .gitignore
-구글에 gitignore python
copy & paste to .gitignore
-7. git add .
-8. git commit -m "내용"

Setting up VSCode
1. django-admin startproject config
2. Rename the outside config (ex. Aconfig)
3. Move inner config and manage.py outside
4. Delete Aconfig (outside config)
5. Change python interpreter to the one with pipenv
6. Enable linter flake 8 (check in .vscode/settings.json
-in bash: pipenv install flake8 --dev
7. Formatter
pipenv install black --dev --pre
안될 경우 settings.json에
"python.formatting.provider": "black",
*1. Formatter -> black
*2. Format on save -> tick
8. Linter & black 체으하기위해
json에 
"python.linting.flake8Args": ["--max-line-length=100"]

Django
1. python manage.py runserver
Quit server: ctrl + c
2. python manage.py migrate
다시 python manage.py runserver
3. python manage.py createsuperuser
ID
pw
4. python manage.py makemigrations

Django applications
1. django-admin startapp (application name plural)
지우고 싶은면 
rm -rj (이름)
admin:
apps:
models: describe what the DB should look like
tests
view: what the user see, put the functions
2. create urls.py in users folder

User App
1. users/models.py (replace default user)
from django.contrib.auth.models
from django.db import models

class user(AbstractUser):
  pass

Applications Definition
1. config/settings.py
1) DJANGO_APPS 만들고
INSTALLED APPS 내용을 여기로 옮김
2) PROJECT_APPS 만들어서
"users.apps.UsersConfig",
3) INSTALLED_APPS = D + P
(static files)

1. AUTH_USER_MODEL = "users.User" 추가

// will get an error
sql should have been deleted
python manage.py
makemigrations

User Model
1. 에러 고치고 서버 킴
2. super user 다시 만들고 admin 로그인
users/admin.py

same from ~
from . import models

@admin.register(models.User)
class CustomUserAdmin(admin.ModelAdmin):
  pass
  
users/models.py

pass 지우고

1. bio = models.TextField()
2. 에러
3. python manage.py makemigrations
4. bio = models.TextField(default = "")   -> null = True 방식도 있음
5. 3번 하삼
6. python manage.py migrate
7. server run 해
