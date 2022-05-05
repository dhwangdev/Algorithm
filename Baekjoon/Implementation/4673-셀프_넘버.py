"""
범위 안의 셀프 넘버를(생성자 없는 숫자) 출력하라

"""

all = [ite1 for ite1 in range(1, 10001)]
notSelf = []

for idx1 in range(1, 10001):
    for idx2 in str(idx1):
        idx1 += int(idx2)

    notSelf.append(idx1)

answerList = [answer for answer in all if answer not in notSelf]

for ele in answerList:
    print(ele)
