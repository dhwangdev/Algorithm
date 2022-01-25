# https://www.acmicpc.net/problem/2884
# 알람 시계 설정하기

H, M = map(int, input().split())
num = H*60+M-45

if num >= 0:
    print(num//60, num%60)
else:
    print((num+24*60)//60, (num+24*60)%60)
