4. List Manipulation Basics
Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:
Add {number}: add a number to the end of the list
Remove {number}: remove a number from the list
RemoveAt {index}: remove a number at a given index
Insert {number} {index}: insert a number at a given index
Note: All the indices will be valid!
When you receive the "end" command print the final state of the list (separated by spaces).

Examples:

Input 1:
4 19 2 53 6 43
Add 3
Remove 2
RemoveAt 1
Insert 8 3
end

Output 1:
4 53 6 8 43 3

Input 2:
12 34 100 1 45 2 8
Add 30
Remove 12
Remove 3
RemoveAt 3
Insert 2 3
end

Output 2:
34 100 1 2 2 8 30