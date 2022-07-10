T = int(input())

main = []
for ite1 in range(T):
    N = int(input())
    temp = []
    for ite2 in range(N):
        fir, sec = input().split()
        temp.append(fir*int(sec))
        all = "".join(temp)

        start = 0
        end = 10
        temp2 = []
        for ite3 in range(len(all)//10 + 1):
            temp2.append(all[start:end])
            start += 10
            end += 10

    main.append(temp2)

for idx in range(T):
    print(f"#{idx+1}")
    for ele in main[idx]:
        print(ele)
