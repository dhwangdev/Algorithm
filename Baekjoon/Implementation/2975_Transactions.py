# https://www.acmicpc.net/problem/2975
# ATM 입출금

while True:
    a, op, b = input().split()
    a, b = int(a), int(b)
    if op == "W":
        if a == 0 and b == 0:
            break
        elif (a-b) >= -200:
            print(a-b)
        elif (a-b) < -200:
            print("Not allowed")
    else:
        print(a+b)
