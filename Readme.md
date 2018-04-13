The goal of the comparator function i wrote, is to compare two strings and then order them according to natural order.
The comparator function will return 1 if string1 is greater, -1 if string2 is smaller and 0 if both two strings are equal.

Lets us consider two strings s1="100 2 10" and s2="100 2 20" for example.

s1->100, s2->100. Equal proceed further.
s1->2, s2->2. Equal proceed further.
s1->10, s2->20. 20>10 so return -1, as string1 is smaller.


s1="1000/2/3", s2="1100/2/5".
s1->1000, s2->1100. Return -1 as s1 is smaller.

I am using delimiter (' ', '/' ,'.') to take out number from strings.

The time complexity of sol'n is O(s1.length + s2.length), despite of the fact that there are two nested loops, but still we are traversing every character of a string atmost once.
