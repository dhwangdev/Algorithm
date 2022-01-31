"""
https://www.acmicpc.net/problem/15366

Ollivanders Wand Shop
Help Harry help Mr Ollivander in putting the wands into the right boxes. Can all the wands be placed in the boxes?
"""

N = int(input())
wand = list(map(int, input().split()))
box = list(map(int, input().split()))
count = 0

wand.sort()
box.sort()

while count <= N:
    if count == N:
        print("DA")
        break
    elif wand[count] <= box[count]:
        count += 1
    else:
        print("NE")
        break
