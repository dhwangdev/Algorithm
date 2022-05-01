"""
시간대에 따라 바뀌는 전화요금이 있을때 사용자의 전화통화 사용량과 시간대가 주어질때 총 전화요금을 구하는 프로그램을 작성하라

"""

N = int(input())
cost = 0
for ite in range(N):
    numbers = input()
    numbers = numbers.replace(":", " ")
    numbers = numbers.split()
    HH, MM, DD = map(int, numbers)

    if (MM + DD) < 60:
        if 7 <= HH < 19:
            cost += 10*DD
        else:
            cost += 5*DD
    elif MM + DD >= 60:
        newMM = (MM+DD)-60
        newHH = HH + 1
        if newHH >= 24:
            newHH -= 24

        if 7 <= HH < 19:
            cost += 10*(60-MM)
        else:
            cost += 5*(60-MM)
        
        if 7 <= newHH < 19:
            cost += 10*newMM
        else:
            cost += 5*newMM

print(cost)
