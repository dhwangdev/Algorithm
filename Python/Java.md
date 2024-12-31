Sort
For an array: Arrays.sort(arr, (람다) -> { 익스프레션 }
For an arrayList: arrList.sort((람다) -> {익스프레션}

Ordering
String: small.compareTo(big)
int: Integer.compare(x, y)
- avoids overflow issues
- safer than direct subtraction: small - big

Comparator
Comparator.comparingInt
ex) Comparator.comparingInt(small -> small[1])
 Comparator.comparingInt(small -> small[1]).reversed()

Custom Lambda Expression
ex) (small, big) -> Integer.compare(small[1], big[1])
(small, big) -> Integer.compare(big[1], small[1])




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

### int to Integer
- Integer.valueOf(숫자);

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
.substring(시작숫자, 끝숫자+1);
.toCharArray();

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
Arrays.sort(mat, (int[] a, int[] b) ->  {
            if (a[1]==b[1]) return a[0]-b[0];
            else return a[1]-b[1];
        });

ArrayList<타입> arrList = new ArrayList<>(사이즈);
arrList.sort(Comparator.comparingInt(o -> o.attribute));
arrList.sort((o1, o2) -> o1.attribute-o2.attribute);
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
poll()
toArray()



