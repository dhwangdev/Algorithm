def solution(nums):
    from itertools import combinations

    answer = 0

    for number in combinations(nums, 3):
        testPrime = sum(number)
        for check in range(2, testPrime):
            if testPrime % check == 0:
                break
        else:
            answer += 1
            
    return answer
