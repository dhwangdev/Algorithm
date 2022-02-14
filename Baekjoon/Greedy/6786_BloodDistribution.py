"""
https://www.acmicpc.net/problem/6786

ABO 및 RH식 혈액형 종류에 알맞게 최대한 많은 환자들이 수혈을 받을 수 있게 프로그램을 작성하기
"""

import sys 

supply = list(map(int, sys.stdin.readline().split()))
patients = list(map(int, sys.stdin.readline().split()))
receive = 0
osurplus = 0
absurplus = 0
index = 0

while True:
    if supply[index] >= patients[index]:
        receive += patients[index]
        if index in range(0, 2):
            osurplus += supply[index]-patients[index]
        elif index in range(2, 8):
            absurplus += supply[index]-patients[index]
            
    else:
        receive += supply[index]
        patients[index] -= supply[index]
        if index in range(1, 6):   
            if osurplus >= patients[index]:
                receive += patients[index]
                osurplus -= patients[index]
            else:
                receive += osurplus
                osurplus = 0
        elif index in range(6, 8):
            if absurplus >= patients[index]:
                receive += patients[index]
                absurplus -= patients[index]
            else:
                receive += absurplus
                patients[index] -= absurplus
                absurplus = 0
                if osurplus >= patients[index]:
                    receive += patients[index]
                    osurplus -= patients[index]
                else:
                    receive += osurplus
                    osurplus = 0

    if index in range(0, 6):        
        index += 2
    elif index == 6:
        index = 1
    elif index == 7:
        break

print(receive)
