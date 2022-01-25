# https://www.acmicpc.net/problem/1110
# 입력한 숫자의 더하기 사이클 길이를 출력한다. 

a = int(input())
initial = a
count = 0

while True:
    op = a//10 + a%10
    a = (a%10)*10 + op%10
    count += 1
    if initial == a:
        break
print(count)
