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
| either or
() capture and group

<Special Sequences>
\A returns a match if the specified characters are at the beginning of the string
\b returns a match where the specified characters are at the beginning or at the end of a word
ex) r"\bain" or r"ain\b" (the "r" in the beginning is making sure that the string is being treated as a "faw string")
\B returns a match where the specified characters are present, but not at the beginning (or at the end) of a word
\d returns a match where the string contains digits (numbers from 0 - 9)
\D returns a match where the string does not contain digits
\s returns a match where the string contains a whitespace character
\S returns a match where the string does not contain a whitespace character
\w returns a match where the string contains any word characters (characters from a to Z, digits from 0-9, and the underscore _ character)
\W returns a match where the string does not contain any word characters
\Z returns a match if the specified characters are at the end of the string

Sets
[arn] returns a match where one of the specified characters (a, r, or n) are present
[a-n] returns a match for any lower case character, alphabetically between a and n
[^arn] returns a match for nay character except a, r, and n
[0123] returns a match where any of the specified digits (0, 1, 2, or 3) are present
[0-9] returns a match for any digit between 0 and 9
[0-5][0-9] returns a match for any two-digit numbers from 00 and 59
[a-zA-z] returns a match for any character alphabetically between a and z, lower case or upper case
[+] in sets, +, *, ., |, (), $, {} has no special meaning, so [+] means: return a match for any + character in the string

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
