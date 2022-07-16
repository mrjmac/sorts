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