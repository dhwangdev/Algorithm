"""
룰에 맞게 최종적으로 가장 높은 숫자의 카드를 뿝는 전략을 세워라
"""

N, M = map(int, input().split())
ans = 0

for idx in range(N):
    cards = list(map(int, input().split()))
    cards.sort()
    if cards[0] > ans:
        ans = cards[0]

print(ans)
