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
