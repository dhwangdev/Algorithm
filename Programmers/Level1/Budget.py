# https://programmers.co.kr/learn/courses/30/lessons/12982
# 예산으로 최대 몇 개의 부서 지원 가능한지 구하기
# 최대수를 구하는것이기 때문에 뒤에서부터 최대값 하나씩 없애면서 예산 안에 들어오게 하기

def solution(d, budget):
    d.sort()
    while sum(d) > budget:
        d.pop()
    return len(d)
