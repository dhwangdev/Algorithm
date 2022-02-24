"""
List

methods
.sort()
.append()
.count()
.reverse()

.extend(iterable)
-adds iterable elements to the end of the current iterable

Functions

enumerate(iterable, start)
-adds counter to an iterable and returns it.
-adds a counter as the key of the enumerate object.
-start: starts counting from this number. (0 is default)

zip(iterables1, iterables2, ...)
-returns a zip object as an iterator of tuples
-each item in each iterable is paired together
-the iterable with the least items decides the length of the new iterable

to unzip:
a, b, c = zip(*zipped_iterable_name)

filter(function, iterable)
-extracts elements from an iterable for which a function returns True
-when None is used as the first argument as the function, all elements that are truthy values (gives True if converted to boolean) are extracted


"""
