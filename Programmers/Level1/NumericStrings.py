"""
https://programmers.co.kr/learn/courses/30/lessons/81301

Convert a mix of strings and numbers to just numbers. 
"""

str_list = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]

def solution(s):
    for idx in range(len(str_list)):
        s = s.replace(str_list[idx], str(idx))
    return int(s)
