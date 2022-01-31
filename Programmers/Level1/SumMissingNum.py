"""
https://programmers.co.kr/learn/courses/30/lessons/86051

Find the sum of missing numbers.
"""

def solution(numbers):
    a = list(range(0, 10))
    for x in numbers:
        if x in a:
            a.remove(x)
    return sum(a)
