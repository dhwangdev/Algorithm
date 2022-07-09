T = int(input())

words = []

for ite1 in range(T):
    words.append(input())

count = 1
for word in words:
    if word == word[::-1]:
        print(f"#{count} 1")
    else:
        print(f"#{count} 0")
    
    count += 1
