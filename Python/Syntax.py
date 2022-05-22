Functions

enumerate(iterable, start)
-(index, element)
-used when you need both the index (or counter- 0 is default) and the element

zip(iterables1, iterables2, ...)
-returns a zip object as an iterator of tuples
-each item in each iterable is paired together
-the iterable with the least items decides the length of the new iterable

to unzip:
a, b, c = zip(*zipped_iterable_name)

list []
tuple ()
set {}
dictionary {}
