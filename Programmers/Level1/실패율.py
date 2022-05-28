def solution(N, stages):
    failRate = []

    for level in range(1, N+1):
        n = 0
        d = 0

        for player in stages:
            if player == level:
                n += 1
            if player >= level:
                d += 1

        if d == 0:
            d = 1
        
        failRate.append(n/d)

    failRate = list(enumerate(failRate, 1))

    failRate.sort(key = lambda x: (-x[1], x[0]))

    ans = [x[0] for x in failRate]

    return ans
