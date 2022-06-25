N, B = input().split()
B = int(B)

letters = {}
for a, b in enumerate(range(ord("A"), ord("Z")+1), 10):
    letters[chr(b)] = a

ans = 0

for num, char in enumerate(N[::-1]):
    ans += letters[char] * (B ** num)

print(ans)

"""
윗 방법은 왜 runtime error가 뜨는지 모르겠다. 결국 문제를 맞추기 위해 알파벳을 밑에 방식처럼 표현할 수 있지만 "A" = 10이 아닐 경우에는 밑에 방식처럼 하기 곤란하다. 
1. 위 방법이 왜 틀린지 모르겠음
2. 일단 시험때는 밑에 방식처럼 하기 (어떻게든 문제는 풀어야하니)
"""

N, B = input().split()
B = int(B)

alpha = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

ans = 0

for num, char in enumerate(N[::-1]):
    ans += alpha.index(char) * (B ** num)

print(ans)
