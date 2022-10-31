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

# <List copy>
"""
- A new list assigned to an old list will incur problems when the new list is changed as the old list will change with it. 
- to resolve this the copy method/ module must be used.
"""

#1. Shallow copy (can usually be used but not for nested lists)
list1 = [1, 2, 3]
list2 = list1.copy()

#2. Deep copy (use this for nested lists)
import copy
list1 = [1, [2, 3], 4]
list2 = copy.deepcopy(list1)

