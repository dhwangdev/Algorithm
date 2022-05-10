def solution(numbers, hand):
    
    keypad = [[1, 2, 3], [4, 5, 6], [7, 8, 9], ["*", 0, "#"]]

    leftThumb = [3, 0]
    rightThumb = [3, 2]

    answer = ""

    for ele in numbers:
        for row in range(len(keypad)):
            for col in range(len(keypad[0])):
                if ele == keypad[row][col]:
                    if col == 0:
                        answer += "L"
                        leftThumb = [row, col]
                    elif col == 2:
                        answer += "R"
                        rightThumb = [row, col]
                    else:
                        leftDis = [abs(row - leftThumb[0]) + abs(col - leftThumb[1])]
                        rightDis = [abs(row - rightThumb[0]) + abs(col - rightThumb[1])]
                        if leftDis < rightDis:
                            answer += "L"
                            leftThumb = [row, col]
                        elif rightDis < leftDis:
                            answer += "R"
                            rightThumb = [row, col]
                        else:
                            if hand == "left":
                                answer += "L"
                                leftThumb = [row, col]
                            else:
                                answer += "R"
                                rightThumb = [row, col]

    return answer
