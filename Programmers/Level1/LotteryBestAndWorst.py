"""
https://programmers.co.kr/learn/courses/30/lessons/77484

로또의 최고 순위와 최저 순위 구하기

Get the int results to correspond to the rank results in the list. 
"""

def solution(lottos, win_nums):
    count = 0
    for ite in lottos:
        if ite in win_nums:
            count += 1
    rank = [6, 6, 5, 4, 3, 2, 1]
    best = rank[lottos.count(0)+count]
    worst = rank[count]
    return [best, worst]
