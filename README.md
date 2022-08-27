# sorts
A collection of niche number sorting methods

# dropsort
A lossy sort whose concept was shamelessly stolen from https://www.dangermouse.net/esoteric/dropsort.html

Drops all numbers that aren't currently in order

While you could use this for important things I would not recommend doing so

Technically O(n) on all cases

# sleepsort
Concept stolen from somewhere, I don't recall where though

Creates a thread for each number which sleeps for the number

Any issues with this are due to the time it takes to create a thread, to fix this change the static divisors. 

Does not work for decimals

The time complexity on this is beyond me but it is probably always slower than any practical algorithim

# selectionsort

Pretty basic but is O(n^2) in all cases so no real reason to ever use this

# bubblesort

Very mediocre, O(n) in best case and O(n^2) on the worst and average cases

# insertionsort

Same as bubblesort

# mergesort

While it can be done without recursion, this is much more simple to implement recursively.

Can be hard to grasp at first, but pretty simple once you think about it a bit.

Great time complexity, O(n*log n) in all cases

# countingsort

Very cool sort. The time complexity is O[n + k], where k is the range of values in the array, in all cases. Might take a minute to wrap your head around it but very cool once you do.

# quicksort

Overhyped, honestly not that complicated when you think about it.

O(n^2) worse case and O(n* log n) in the average and best case. A little bit faster than mergesort on average, however if you pick a bad pivot then it will be slower. 

# radixsort

Whoever thought of this is genius.

Just a counting sort on all digits of every number which means saves time as each counting sort only ever has to go up to 9 at max.

O(d(n+k)) where K is the greatest number in the digits spot and d is the number of digits. Not sure if I'm right on this.


