"""
https://www.acmicpc.net/problem/10280

Pizza Voting

"""

import sys

n, p = map(int, sys.stdin.readline().split())
menu = dict()

for _ in range(n):
    cal, pizza = sys.stdin.readline().split()
    cal = int(cal)
    menu[pizza] = cal

menu = sorted(menu.items(), key=lambda x: x[1])
my_pizza = list(menu[p-1])

for idx in range(n-1):
    if idx%3 == 0:
        Alice = -1
        menu.pop(Alice)
        continue
    if idx%3 == 1:
        Bob = 0
        menu.pop(Bob)
        continue
    if idx%3 == 2:
        Me = 1
        if menu[Me] == my_pizza:
            Me += 1
        menu.pop(Me)
        continue

if menu[0] == my_pizza[0] and menu[1] == my_pizza[1]:
    print("YES")
else:
    print("NO")

"""
print(menu[0])
print(menu[1])
print(my_pizza[0])
print(my_pizza[1])
"""
