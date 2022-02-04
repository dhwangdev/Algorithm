"""
https://www.acmicpc.net/problem/2108

"""

import sys

N = int(sys.stdin.readline())
num = []

for ite in range(N):
    ite = int(sys.stdin.readline())
    num.append(ite)

num.sort()

avg1 = round(sum(num)/len(num))

m_ind = len(num)//2
med2 = num[m_ind]

range4 = max(num) - min(num)

print(avg1, med2, range4)
