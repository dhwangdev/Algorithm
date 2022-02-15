"""
입력한 숫자가 1이 될 때까지 최소 횟수를 구하는 프로그램을 작성하시오
"""

import sys

N, K = map(int, sys.stdin.readline().split())
result = 0

while N != 1:
    if N%K == 0:
        N = N/K
    else:
        N -= 1
    result += 1

print(result)
