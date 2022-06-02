N = int(input())
can = []
for rep1 in range(N):
    can.append(int(input()))

ans = 0

can = list(enumerate(can, 1))

for idx in range(N):
    can[idx] = list(can[idx])

can.sort(key=lambda x : (-x[1], -x[0]))

while can[0][0] != 1:
    can[0][1] -= 1

    for index in range(N):
        if can[index][0] == 1:
            can[index][1] += 1
    
    can.sort(key=lambda x : (-x[1], -x[0]))

    ans += 1

print(ans)
