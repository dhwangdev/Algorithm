"""
<Modules>

<RegEX (Regular Expression)>
-RegEx is a sequence of characters that forms a search pattern. 

import re

<RegEx Functions>
findall: returns a list containing all matches
search: returns a match object if there is a match anywere in the string
split: returns a list where the string has been split at each match
sub: replaces one or many matches with a string

<Metacharacters>
. any character (except newline character)
^ starts with
$ ends with
[] a set of characters
\ special sequence
* zero or more occurrences
+ one or more occurrences
? zero or one occurrences
{} exactly the specified number of occurrences


List

methods
.sort()
.append()
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


"""
