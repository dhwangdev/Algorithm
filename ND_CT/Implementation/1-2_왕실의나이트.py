"""
체스판 위에 나이트에 위치를 입력하면 이동가능한 모든 위치를 구하라

1. Think of the positions as a pair of two numbers not a pair of a letter with a number. 
2. Use sublists for the movement instead of creating numerous lists
3. Unncessary to create a chessboard. Instead just 1 <= x <= 8 and 1 <= y <= 8 have to be met. 

"""

pos = input()
colPos = ord(pos[0]) - ord("a") + 1
rowPos = int(pos[1])
count = 0

move = [(-2, -1), (-2, 1), (-1, -2), (-1, 2), (1, -2), (1, 2), (2, -1), (2, 1)]

for ele in move:
    newCol = colPos + ele[0]
    newRow = rowPos + ele[1]

    if newCol >= 1 and newCol <= 8 and newRow >= 1 and newRow <= 8:
        count += 1

print(count)
