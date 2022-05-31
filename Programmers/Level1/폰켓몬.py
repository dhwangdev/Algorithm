def solution(nums):
    N = len(nums)
    unique = set(nums)
    count = len(unique)
    if N//2 > count:
        ans = count
    else:
        ans = N//2

    return ans
