"""
https://programmers.co.kr/learn/courses/30/lessons/12985

예상 대진표:

두 선수가 몇 라운드에서 서로 만나는지 찾기
"""

def solution(N, A, B):
    count = 0
    while A != B:
        count += 1
        A, B = (A+1)//2, (B+1)//2
    return count
