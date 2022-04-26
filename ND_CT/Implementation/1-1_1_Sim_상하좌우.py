"""
여행가가 최종적으로 도착하는 곳의 좌표를 출력하는 프로그램을 작성해라
"""

N = int(input())
path = input().split()

x, y = 1, 1

move = ["L", "R", "U", "D"]
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

for ele in path:
    for idx in range(len(move)):
        if ele == move[idx]:
            nx = x + dx[idx]
            ny = y + dy[idx]
        
    if nx < 1 or ny < 1 or nx > N or ny > N:
        continue

    x = nx
    y = ny

print(x, y)
