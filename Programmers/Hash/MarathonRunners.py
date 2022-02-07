"""
https://programmers.co.kr/learn/courses/30/lessons/42576

완주하지 못한 선수를 return 하라

1) Import the collections module to use the counter method. The two lists should now be {objects: counts}.
2) Get the key from the resulting dictionary, turn it into a list, and then grab index 0 to return the element.
"""

import collections

def solution(participant, completion):
    answer = collections.Counter(participant) - collections.Counter(completion)
    return list(answer.keys())[0]
