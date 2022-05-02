"""
주어진 입력문의 알파벳은 오름차순으로 정렬하고 숫자를 더한 값을 출력하라

"""

S = input()

letters = []
num = 0

for ele in S:
    if ele.isalpha():
        letters.append(ele)
    else:
        num += int(ele)

letters.sort()

answer = ("".join(letters)) + str(num)

print(answer)
