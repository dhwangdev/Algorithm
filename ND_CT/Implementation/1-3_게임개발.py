"""
캐릭터가 특정 과정을 반복적으로 수행한 다음, 캐릭터가 방문한 칸의 수를 출력하라
"""

N, M = map(int, input().split())
A, B, d = map(int, input().split())
world = []
for _1 in range(N):
    world.append(list(map(int, input().split())))

visited = [[0] * M for _2 in range(N)]
visited[A][B] = 1

def left():
    global d
    d -= 1
    if d == -1:
        d = 3

move = [[-1, 0], [0, 1], [1, 0], [0, -1]]

count = 1
turn = 0

while True:
    left()

    newA = A + move[d][0]
    newB = B + move[d][1]

    if world[newA][newB] == 0 and visited[newA][newB] == 0:
        visited[newA][newB] = 1
        A = newA
        B = newB
        count += 1
        turn = 0
        continue
    else:
        turn += 1

    if turn == 4:
        turn = 0
        newA = A - move[d][0]
        newB = B - move[d][1]
        if world[newA][newB] == 0:
            A = newA
            B = newB
        else:
            break

print(count)
