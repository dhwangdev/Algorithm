"""
주어진 동전을 이용하여 만들 수 없는 양의 정수 금액 중 최솟값을 구하는 프로그램을 작성하시오.
"""

import sys

N = int(sys.stdin.readline())
coins = list(map(int, sys.stdin.readline().split()))

result = 1

for ite in coins:
    if result < ite:
        break
    result += ite

print(result)
