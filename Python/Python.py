# <Range of alphabet characters>

# ord("a"): returns the Unicode integer value of any Unicode character
# chr(110): returns the character value of an integer

# To print from "a" to "h"

for num in range(ord("a"), ord("h") + 1):
    print(chr(num))
