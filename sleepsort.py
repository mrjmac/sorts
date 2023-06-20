from concurrent.futures import thread
from threading import Thread
from time import sleep

# sleep function
def wait(i) :
    # for negative numbers, divide a constant by them in order to make larger(which are in turn lower) numbers print first
    if i < 0 :
        sleep(.25 / abs(i))
    # for positive numbers, divide by a constant to decrease time spent waiting
    else :
        sleep(i / 2)
    # print the number
    print(i)

# take in a string of numbers and cast them all to ints before adding them to a list
nums = list(map(int, input("Enter nums in format x x x x (ex: 1 2 3 4 5) :: ").split()))

# iterate through the list and call our sleep function on every number in an individual thread
for item in nums :
    x = Thread(target=wait, args=(item,)).start()
    
    

