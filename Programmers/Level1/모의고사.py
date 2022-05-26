def solution(answers):
    fir = [1, 2, 3, 4, 5]
    sec = [2, 1, 2, 3, 2, 4, 2, 5]
    thi = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    score = [0, 0, 0]
    ans = []

    for idx, num in enumerate(answers):
        if num == fir[idx%len(fir)]:
            score[0] += 1
        if num == sec[idx%len(sec)]:
            score[1] += 1
        if num == thi[idx%len(thi)]:
            score[2] += 1
    
    for person, number in enumerate(score, 1):
        if number == max(score):
            ans.append(person)

    return ans
