from collections import deque

def solution(board, moves):

    basket = deque([])
    answer = 0

    for ele in moves:
        for idxRow in range(len(board)):
            if board[idxRow][ele-1] != 0:
                basket.appendleft(board[idxRow][ele-1])
                board[idxRow][ele-1] = 0
                
                if len(basket) >= 2:
                    if list(basket)[0] == list(basket)[1]:
                        basket.popleft()
                        basket.popleft()
                        answer += 2
                break

    return answer
