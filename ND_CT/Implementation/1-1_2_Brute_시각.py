"""
시각에서 특정 숫자가 포함되어 있는 모든 경우의 수를 구하라
"""

N = int(input())
count = 0

for hr in range(N + 1):
    for min in range(60):
        for sec in range(60):
            if "3" in (str(hr) + str(min) + str(sec)):
                count += 1

print(count)
