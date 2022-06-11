from this import d


xmax, ymax = map(int, input().split())
K = int(input())

track = [[0]*xmax for _1 in range(ymax)]
seats = {}

x, y = 1, 1
d = 0

def turn():
    d += 1
    if d == 4:
        d = 0

move = [[-1, 0], [0, 1], [1, 0], [0, -1]]

for num in range(1, xmax*ymax+1):
    row, col = ymax-y, x-1
    if 0 <= row <= ymax and 0 <= col <= xmax and track[row][col] == 0:
        seats[num] = f"{x} {y}"
        track[row][col] = 1
        
    else:
        d += 1

    
