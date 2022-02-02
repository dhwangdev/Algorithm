"""
https://www.acmicpc.net/problem/5585

거스름돈 개수가 가장 적은 잔돈을 구하기
"""

cash = 1000-int(input())
change = [1, 5, 10, 50, 100, 500]
change.sort(reverse=True)
count = 0
index = 0

while index < len(change):
    if cash//change[index] > 0:
        count = count + cash//change[index]
        cash = cash%change[index]
    index += 1

print(count)
