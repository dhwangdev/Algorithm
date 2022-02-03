"""
https://www.acmicpc.net/problem/2741

Print from 1 to N. Comprehension Code. 
"""

# 1

N = int(input())

for num in range(1, N+1):
    print(num)

# 2

[print(num) for num in range(1, int(input())+1)] 
