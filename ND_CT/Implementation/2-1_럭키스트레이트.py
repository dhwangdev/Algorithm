"""
입력된 숫자가 어떤 특정 조건을 성립할 때 이에 맞는 출력문이 나오는 프로그램을 작성하라
"""

N = input()

half = len(N)//2
front = 0
back = 0

for ele1 in range(half):
    front += int(N[ele1])
    
for ele2 in range(half, len(N)):
    back += int(N[ele2])

if front == back:
    print("LUCKY")
else:
    print("READY")
