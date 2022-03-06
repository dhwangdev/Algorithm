"""
https://programmers.co.kr/learn/courses/30/lessons/42747

H-index 구하기
"""

def solution(citations):
    citations.sort(reverse=True)
    answer = max(map(min, enumerate(citations, start=1)))
    return answer
