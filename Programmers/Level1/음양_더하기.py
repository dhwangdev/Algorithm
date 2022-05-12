def solution(absolutes, signs):
    answer = 0
    for num, posMin in zip(absolutes, signs):
        if posMin:
            answer += num
        else:
            answer -= num
    return answer
