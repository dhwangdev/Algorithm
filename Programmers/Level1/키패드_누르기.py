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
                    elif col == 2:
                        answer += "R"
                    else:
                        leftDis = [row - leftThumb[0], col - leftThumb[1]]
                        rightDis = [row - rightThumb[0], col - rightThumb[1]]
                        



                        """
                        1. distance 계산후 L 인지 R 인지 확인
                        2. distance 가 같을때 hand 기준으로 정하기
                        3. coor의 기준이 현재인지 start 인지
                            1) 현재:


                            2) start: 
                        4. declare leftcoor or leftDis first??

                        """
