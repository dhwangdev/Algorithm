# https://programmers.co.kr/learn/courses/30/lessons/12943
# Collatz Conjecture에 대한 정의가 공식 정의랑 문제에서 설명한 정의가 다름. 공식 정의는 시작 숫자가 자연수라는 조건이 있다. 

def solution(num):
    count = 0
    while count < 500:
        if num == 1:
            break
        elif num%2 == 0:
            num = num/2
        else:
            num = num*3+1
        count += 1
        
    if count == 500:
        count = -1
        
    return count
    
