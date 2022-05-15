def solution(answers):
    fir = [1, 2, 3, 4, 5]
    sec = [2, 1, 2, 3, 2, 4, 2, 5]
    thi = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    count = [0, 0, 0]

    answer = max(count)

    for idx in range(len(answers)):
        if fir[idx] == answers[idx]:
            count[0] += 1
