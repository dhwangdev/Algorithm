"""
https://programmers.co.kr/learn/courses/30/lessons/42862

Make as many students be able to wear their PE uniforms as possible
"""

def solution(n, lost, reserve):
    lost.sort()
    reserve.sort()
    # 본인 체육복이 없고 여벌이 있을 경우 남에게 여벌을 빌려줄 수 없다
    newlost = [x for x in lost if x not in reserve]
    newreserve = [y for y in reserve if y not in lost]
    # 여벌 나눠주기
    for ite in newreserve:
        small = ite-1
        big = ite+1
        if small in newlost:
            newlost.remove(small)
        elif big in newlost:
            newlost.remove(big)
    return n-len(newlost)
