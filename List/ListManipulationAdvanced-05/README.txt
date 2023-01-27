5. List Manipulation Advanced
Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:
Contains {number} - check if the list contains the number. If yes print "Yes", otherwise print "No such number"
Print even - print all the numbers that are even separated by a space
Print odd - print all the numbers that are oddly separated by a space
Get sum - print the sum of all the numbers
Filter {condition} {number} - print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="

Examples:

Input 1:
2 13 43 876 342 23 543
Contains 100
Contains 543
Print even
Print odd
Get sum
Filter >= 43
Filter < 100
end

Output 1:
No such number
Yes
2 876 342
13 43 23 543
1842
43 876 342 543
2 13 43 23

Input 2:
12 3 123 546 222 45 7
Contains 3
Contains 121
Print even
Print odd
Get sum
Filter >= 100
Filter < 45
end

Output 2:
Yes
No such number
12 546 222
3 123 45 7
958
123 546 222
12 3 7