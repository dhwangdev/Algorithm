def solution(N, stages):
    failRate = []
    
    for stage in range(N):
        for player in stages:
            n = 0
            d = 0
            if player == stage:
                n += 1

            if player >= stage:
                d += 1

        failRate.append(n/d)

    
