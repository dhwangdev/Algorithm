"""
https://www.acmicpc.net/problem/15552

sys.stdin.readline() 이 input() 보다 빠르다. 입력값에 따라 문제 푸는데 시간초과될 수 있으니 두 방식을 다 숙지하고 있어야 한다. 
"""

import sys

T = int(sys.stdin.readline())

for add in range(T):
    A, B = map(int, sys.stdin.readline().split())
    print(A+B)
