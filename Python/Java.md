### Array copy
- A new array assigned to an old array will incur problems when the new array is changed as the old array will change with it.
- To resolve this the copy should be used.

1. Shallow copy (can usually be used but not for nested arrays)

int[] array1 = {1, 2, 3};
int[] array2;
array2 = array1.clone();

2. Deep copy (use this for nested arrays)



### int to String
- Use String.valueOf(숫자) because 숫자.toString() cannot work as primitives do not use the latter 

### Check data type
변수/ 객체 .getClass().getSimpleName();

### StringTokenizer
ex)
st = new StringTokenizer(br.readLine(), "@#$");

### String
.split(" ");
(can return a string array)
contains
replaceAll


### System
compareTo
stringbuilder
sb.setLength(0);
System.exit(0);

### Collections
arraylist
add
get
indexOf
size
isEmpty

hashset
add
remove
contains

hashmap
put
get
getOrDefault
remove
containsKey
containsValue

deque
offerLast
offerFirst
size
isEmpty
peekLast
peekFirst
add

PriorityQueue<타입> pq = new PriorityQueue<>(Collections.reverseOrder());



### Object
getClass().getName();
