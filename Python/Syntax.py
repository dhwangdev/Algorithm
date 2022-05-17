Functions

enumerate(iterable, start)
-(index, element)
-used when you need both the index and the element
-adds counter to an iterable and returns it.
-adds a counter as the key of the enumerate object.
-start: starts counting from this number. (0 is default)

zip(iterables1, iterables2, ...)
-returns a zip object as an iterator of tuples
-each item in each iterable is paired together
-the iterable with the least items decides the length of the new iterable

to unzip:
a, b, c = zip(*zipped_iterable_name)
