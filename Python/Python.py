# <Range of alphabet characters>

# ord("a"): returns the Unicode integer value of any Unicode character
# chr(110): returns the character value of an integer

# To print from "a" to "h"

for num in range(ord("a"), ord("h") + 1):
    print(chr(num))

# <Doubly Ended Queue>

# 1. Declare deque
from collections import deque
리스트 = deque([])

#2. Add/ Remove elements
appendleft(밸류)
popleft() # empty parentheses

#3. Convert deque back to list
list(데큐_리스트)

# <String join method>

Iterable = [내용, etc]

변수 = "세퍼레이터".join(Iterable)
