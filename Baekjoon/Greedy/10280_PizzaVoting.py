"""
https://www.acmicpc.net/problem/10280

Pizza Voting

1) Use sorted() and the lambda function to sort the dictionary based on the values to now have tuples in a list. 

2) For -> if -> continue to keep coming back up to the start of the loop.

3) Compare the right things. 
ex) (Tuple) vs (Tuple)  O
    [(Tuple in a list)] vs (Tuple)  X
"""

import sys

n, p = map(int, sys.stdin.readline().split())
menu = dict()

for _ in range(n):
    cal, pizza = sys.stdin.readline().split()
    cal = int(cal)
    menu[pizza] = cal

menu = sorted(menu.items(), key=lambda x: x[1])
my_pizza = menu[p-1]

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
        Me = 0
        if menu[Me] == my_pizza:
            Me += 1
        menu.pop(Me)
        continue

if menu[0] == my_pizza:
    print("YES")
else:
    print("NO")
