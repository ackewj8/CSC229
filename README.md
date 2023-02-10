# CSC229
Repository for CSC 229 Assignments

Author: William Ackerman/@willi

User inputs 5 integer values into an array. a for loop and a scanner, scnr are used to read the user's input values.

Then, that array is sorted in ascending order using selection sort. A respective algorithm is implemented as well.
The arguments for selectionSort are the array, series, and the size of the array, size.

Afterwards, the user is asked what integer they would like to search for, which is read by the scanner, scnr.

Then, the user is presented a choice of either a linear search by typing in 1, or a binary search by typing in 2.
A while loop makes sure that the user inputs either a 1 or a 2, and the value is read by choice.

If choice is equal to 1, a linear search is implemented by setting the searchIndex variable equal to the linearSearch algorithm. For the arguments, 
series is the array, size is the size, and search is the integer that the user wants to search for. If search is not found, the algorthim returns a
value of -1. If searchIndex is equal to -1, the integer was not found. If the integer was found, the program notifies the user that the integer they
entered as search was successfully found, as well as what index it was found at.

If choice is equal to 2, a binary search is implemented by setting the searchIndex variable equal to the binarySearch algorithm. For the arguments,
search is used for the integer that the user wishes to search for, and series is the array that is being searched. Once again, a return value of -1
for searchIndex indicates that the element was not found. If the integer was found, the program notifies the user that the integer they
entered as search was successfully found, as well as what index it was found at.
