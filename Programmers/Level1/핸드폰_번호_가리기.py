"""
핸드폰 번호 가리기 
첫 7자리 번호를 *로 바꾸기

"""


def solution(phone_number):
    answer = phone_number.replace(phone_number[0:-4], "*" * len(phone_number[0:-4]))
                                                            
    return answer
