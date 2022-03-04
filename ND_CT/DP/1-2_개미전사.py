"""
일직선상에 존재하는 식량창고를 약탈할때 얻을 수 있는 식량의 최댓값을 구하기
"""

n = int(input())
k = list(map(int, input().split()))

d = [0] * 101

d[0] = k[0]
d[1] = max(k[0], k[1])
for ite in range(2, n):
    d[ite] = max(d[ite-1], d[ite-2] + k[ite])

print(d[n-1])
