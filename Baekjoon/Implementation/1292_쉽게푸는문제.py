"""
수열의 일정한 구간의 합을 구하시오

"""

A, B = map(int, input().split())

numList = []
for num in range(1, 1001):
    for repeat in range(num):
        numList.append(num)

print(sum(numList[A-1:B]))
