def solution(left, right):
    ans = 0
    for end in range(left, right + 1):
        count = 0
        for num in range(1, end+1):
            if end % num == 0:
                count += 1

        if count % 2 == 0:
            ans += end
        else:
            ans -= end

    return ans
