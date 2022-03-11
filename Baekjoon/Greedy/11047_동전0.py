"""
https://www.acmicpc.net/problem/11047

필요한 동전 개수의 최솟값을 구하시오
"""

import sys

N, K = map(int, sys.stdin.readline().split())

coin_list = []

for coin in range(N):
    coin_list.append(int(sys.stdin.readline()))

coin_list.sort(reverse=True)
count = 0

for ite in range(N):
    if coin_list[ite] <= K:
        count += K // coin_list[ite]
        if K == coin_list[ite]:
            break
        else:
            K = K % coin_list[ite]

print(count)
