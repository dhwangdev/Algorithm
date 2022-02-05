"""
https://programmers.co.kr/learn/courses/30/lessons/42748

K번째 수

The trick here was to unpack the list to make the code more elegant. 
"""

def solution(array, commands):
    result = list()
    for ite in commands:
        i, j, k = ite
        new_array = array[i-1:j]
        new_array.sort()
        result.append(new_array[k-1])
    return result
