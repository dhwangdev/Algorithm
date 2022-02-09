"""
https://programmers.co.kr/learn/courses/30/lessons/42746

From a list of numbers, align the numbers to form one final number so that the resulting number is the biggest it can be. 
"""

def solution(numbers):
    numbers = list(map(str, numbers))
    numbers.sort(key=lambda x: x*3, reverse=True)
    return str(int(''.join(numbers)))
