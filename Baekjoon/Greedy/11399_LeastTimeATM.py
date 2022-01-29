"""
https://www.acmicpc.net/problem/11399

사람들이 줄을 서는 순서에 따라 돈을 인출하는데 걸리는 최소시간 구하기
"""

N = int(input())
P = list(map(int, input().split()))

P.sort()

for k in range(1, N):
    P[k] += P[k-1]

print(sum(P))
