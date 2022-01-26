# https://programmers.co.kr/learn/courses/30/lessons/82612
# 부족한 금액 계산하기 
# max 이용해서 return

def solution(price, money, count):
    return max(0, (price*(1+count)*(count/2)-money))
