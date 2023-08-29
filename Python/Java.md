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

### Object
get name of object: getClass().getName();
get(check) data type: getClass().getSimpleName();

### StringTokenizer
ex)
st = new StringTokenizer(br.readLine(), "@#$");

### String
.split(" ");
(can return a string array)
contains
replaceAll
스트링.repeat(반복할_횟수);

### System
compareTo
stringbuilder
sb.setLength(0);
System.exit(0);

### Collections
Array
for 2D array:
Arrays.sort(mat, Comparator.comparingInt( (int[] a) -> a[1]) );
끝에 .reversed();

ArrayList<타입> arrList = new ArrayList<>(사이즈);
add
get
indexOf
size
isEmpty

HashSet<타입> hs = new HashSet<>();
add
remove
contains

HashMap<타입1, 타입2> hm = new HashMap<>();
put
get
getOrDefault
remove
containsKey
containsValue
hm.keySet(): returns a set view of all the keys of the hashmap

Deque<타입> deque = new ArrayDeque<>();
offerLast
offerFirst
size
isEmpty
peekLast
peekFirst
add

PriorityQueue<타입> pq = new PriorityQueue<>(Collections.reverseOrder());
offer
toArray()



