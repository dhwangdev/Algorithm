"""
https://www.acmicpc.net/problem/1924

Input the date and return the day of the week for the year 2007. 
"""

import sys

thirtyone = [1, 3, 5, 7, 8, 10, 12]
thirty = [4, 6, 9, 11]
twentyeight= [2]

months = list()
months.extend(thirtyone)
months.extend(thirty)
months.extend(twentyeight)
months.sort()

days = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]

calendar = dict()
for ite in thirtyone:
    calendar[ite] = 31
for ite in thirty:
    calendar[ite] = 30
for ite in twentyeight:
    calendar[ite] = 28

x, y = map(int, sys.stdin.readline().split())

num = 0

for ite in range(1,x):
    num += calendar[ite]
num += y

print(days[num%7])
