#1. Make my own alphabet dict
N, B = map(int, input().split())

letters = {}
for a, b in enumerate(range(ord("A"), ord("Z")+1), 10):
    letters[a] = chr(b)

ans = []
while N >= B:
    ans.append(letters[N%B])
    N = N//B

ans.append(letters[N])

ans = "".join(ans[::-1])

print(ans)

#2. Have an alphabet string to work on
N, B = map(int, input().split())

alpha = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

ans = []
while N >= B:
    ans.append(alpha[N%B])
    N = N//B

ans.append(alpha[N])

ans = "".join(ans[::-1])

print(ans)
