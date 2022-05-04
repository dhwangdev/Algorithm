"""
문자열 리스트를 인덱스 숫자를 기준으로, 인덱스가 같을때는 앞선 문자열이 앞쪽으로 위치하게 오름차순으로 정렬하기

"""

def solution(strings, n):
    return sorted(strings, key = lambda x: (x[n], x))
