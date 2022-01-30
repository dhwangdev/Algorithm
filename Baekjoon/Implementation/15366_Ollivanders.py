"""
https://www.acmicpc.net/problem/15366

Ollivanders Wand Shop
Can all the wands be placed into the boxes?
"""

N = int(input())
wand = list(map(int, input().split()))
box = list(map(int, input().split()))

wand.sort()
box.sort()
count = 0

while count < N:
    if wand[0] > box[0]:
        print("NE")
        break
    elif count < N:
        count += 1

if count == N:
    print("DA")


