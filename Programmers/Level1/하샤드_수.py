"""
하샤드 수

"""

def solution(x):
    sum = 0

    for ite in str(x):
        sum += int(ite)
    
    if x % sum == 0:
        return True
    else:
        return False
