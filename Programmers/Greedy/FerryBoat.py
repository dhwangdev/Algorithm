"""
https://programmers.co.kr/learn/courses/30/lessons/42885

구명보트가 이동해야하는 횟수
"""

def solution(people, limit):
    people.sort()
    small = 0
    big = len(people)-1
    pairs = 0
    
    while small < big:
        if people[small]+people[big] <= limit:
            small += 1
            pairs += 1
        big -= 1
    return len(people)-pairs
