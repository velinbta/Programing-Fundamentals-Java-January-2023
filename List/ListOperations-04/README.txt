4. List Operations
You will be given numbers (list of integers) on the first input line. Until you receive "End" you will be given operations you have to apply on the list. The possible commands are:

Add {number} - add number at the end
Insert {number} {index} - insert number at given index
Remove {index} - remove that index
Shift left {count} - first number becomes last 'count' times
Shift right {count} - last number becomes first 'count' times

Note: The index given may be outside of the bounds of the array. In that case print "Invalid index".

Examples:

Input 1:
1 23 29 18 43 21 20 
Add 5
Remove 5
Shift left 3
Shift left 1
End

Output 1:
43 20 5 1 23 29 18

Input 2:
5 12 42 95 32 1
Insert  3 0
Remove 10
Insert 8 6
Shift right 1
Shift left 2
End

Output 2:
Invalid index
5 12 42 95 32 8 1 3