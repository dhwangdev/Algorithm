"""
Hamming distance의 합이 가장 작은 DNA를 출력하고, 그 hamming distance의 합을 출력하고 그러한 DNA가 여러 개 있을 때에는 사전순으로 가장 앞서는 것을 출력하시오

"""

N, M = map(int, input().split())

DNA = []
for ite1 in range(N):
    DNA.append(input())

answerList = []

for idx1 in range(M):
    strands = [["A", 0], ["C", 0], ["G", 0], ["T", 0]]
    for ele1 in DNA:
        for idx2 in range(len(strands)):
            if ele1[idx1] == strands[idx2][0]:
                strands[idx2][1] += 1
            
    sortStrands = sorted(strands, key = lambda x: x[1], reverse = True)
    answerList.append(sortStrands[0][0])

hammingDNA = "".join(answerList)

count = 0
for idx3 in range(M):
    for idx4 in range(N):
        if hammingDNA[idx3] != DNA[idx4][idx3]:
            count += 1

print(hammingDNA)
print(count)
