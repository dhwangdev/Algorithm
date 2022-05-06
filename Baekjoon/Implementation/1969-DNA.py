N, M = map(int, input().split())
DNA = []
strandList = [("G", 0) ("C", 0), ("T", 0),  ("A", 0)]

for strands in range(N):
    DNA.append(input())

for idx in range(M):
    for ele in DNA:
        for idxStrand in range(len(strandList)):
            if ele[idx] == strandList[idxStrand][1]:
                strandList[idxStrand][1] += 1
    strandList.sort(key= lambda x: x[1])
