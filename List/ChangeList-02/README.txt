2. Change List
Write a program, which reads a list of integers from the console and receives commands, which manipulate the list. Your program may receive the following commands: 

Delete {element} - delete all elements in the array, which are equal to the given element
Insert {element} {position} - insert element at the given position

You should stop the program when you receive the command "end". Print all numbers in the array separated with a single whitespace.

Examples:

Input 1:
1 2 3 4 5 5 5 6
Delete 5
Insert 10 1
Delete 5
end

Output 1:
1 10 2 3 4 6

Input 2:
20 12 4 319 21 31234 2 41 23 4
Insert 50 2
Insert 50 5
Delete 4
end

Output 2:
20 12 50 319 50 21 31234 2 41 23