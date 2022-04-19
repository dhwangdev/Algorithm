"""
거슬러줘야 할 동전의 최소 개수를 구하기
"""

N = int(input())
count = 0

coins = [500, 100, 50, 10]

for amount in coins:
    count += N // amount
    N %= amount

print(count)
