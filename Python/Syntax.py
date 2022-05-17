List

methods
.sort()
.append() -> value
.remove() -> value
.count()
.reverse()

.extend(iterable)
-adds iterable elements to the end of the current iterable

.index(element, start_index, end_index)
-returns the index at the first occurrence of the specified element

.insert(index, element)
-the element is insert to the index position

.pop(index)
-removes the item at the given index from the list and returns the removed item
- default index is -1



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

filter(function, iterable)
-extracts elements from an iterable for which a function returns True
-when None is used as the first argument as the function, all elements that are truthy values (gives True if converted to boolean) are extracted

sorted()


Dictionary


Methods:
.update(iterable)
-updates the dictionary with the elements from an iterable of key/value pairs.
-if key already exists it will be updated with the new value
-if key doesn't exist, the new key/value pair will be updated

** method (Kwargs)
dict = {**iterable1, **iterable2, etc}
-merge dictionaries

Set

Methods:

.union() return a set containing the union of sets
.intersection() returns a set, that is the intersection of two or more sets
.intersection_update() removes the items in this set that are not present in other, specified sets
.difference() returns a set containing the difference between two or more sets
.difference_update() removes the items in this set that are also included in another, specified set
.update() update the set with another set, or any other iterable
.symmetric_difference() returns a set with the symmetric differences of two sets
.symmetric_difference_update() inserts the symmetric differences from this set and another
.issubset() returns whether another set contains this set or not
.issuperset() returns whether this set contains another set or not
.isdisjoint() returns whether two sets have an intersection or not



"""
