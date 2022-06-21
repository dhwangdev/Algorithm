N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
S = 0

newB = list(enumerate(B))
A.sort(reverse=True)

newB.sort(key=lambda x: x[1])
newA = []
for idx in range(N):
    newA.append((newB[idx][0], A[idx]))

newA.sort(key=lambda x: x[0])

for idx2 in range(N):
    S += newA[idx2][1]*B[idx2]

print(S)
