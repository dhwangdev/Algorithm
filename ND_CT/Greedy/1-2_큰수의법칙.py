"""
큰 수의 법칙에 따라 가장 큰 수를 만들 수 있는 방식을 찾아라
"""

N, M, K = map(int, input().split())
num = list(map(int, input().split()))

num.sort(reverse=True)

cycle = M // (K+1)
rem = M % (K+1)

answer = cycle*(num[0]*K + num[1]) + rem*num[0]

print(answer)
