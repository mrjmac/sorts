# sorts
A collection of number sorting methods

## dropsort
A lossy sort

Drops all numbers that aren't currently in order

While you could use this for important things I would not recommend doing so

Technically O(n) on all cases

## sleepsort

Creates a thread for each number which sleeps for the number

Any issues with this are due to the time it takes to create a thread, to fix this change the static divisors

Does not work for decimals

The time complexity on this is beyond me but it is probably always slower than any practical algorithim

## selectionsort

Pretty basic but is O(n^2) in all cases so no real reason to ever use this

## bubblesort

Very mediocre, O(n) in best case and O(n^2) on the worst and average cases

## insertionsort

Very mediocre, O(n) in best case and O(n^2) on the worst and average cases

## mergesort

While it can be done without recursion, this is much more simple to implement recursively.

Great time complexity, O(n*log n) in all cases

## countingsort

Very cool sort. The time complexity is O[n + k], where k is the range of values in the array, in all cases.

## quicksort

O(n^2) worse case and O(n* log n) in the average and best case. A little bit faster than mergesort on average, however if you pick a bad pivot then it will be slower. 

## radixsort

Just a counting sort on all digits of every number which means saves time as each counting sort only ever has to go up to 9 at max.

O(nk) in all cases.

## bogosort

...

## bogobogosort

Somehow significantly worse than the bogosort. Try running this with more than 5 or 6 elements (it won't finish).
