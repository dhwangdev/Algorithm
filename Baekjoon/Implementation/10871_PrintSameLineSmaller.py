"""
https://www.acmicpc.net/problem/10871

Print all the numbers smaller than X on the same line. Trick is to use 

print(ite, end = " ")
"""

N, X = map(int, input().split())
A = list(map(int, input().split()))

for smaller in range(N):
    if A[smaller] < X:
        print(A[smaller], end = " ")
