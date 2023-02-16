3. Numbers
Link: https://judge.softuni.org/Contests/Practice/Index/2474#2

Write a program to read a sequence of integers and find and print the top 5 numbers greater than the average value in the sequence, sorted in descending order.

Input
Read from the console a single line holding space-separated integers.

Output
Print the above-described numbers on a single line, space-separated. 
If less than 5 numbers hold the property mentioned above, print less than 5 numbers. 
Print "No" if no numbers hold the above property.

Constraints
All input numbers are integers in the range [-1 000 000 .... 1 000 000]. 
The count of numbers is in the range [1....10 000].

Examples:

Input 1:
10 20 30 40 50

Output 1:
50 40

Comment 1:
Average number = 30.
Numbers greater than 30 are: {40, 50}. 
The top 5 numbers among them in descending order are: {50, 40}.
Note that we have only 2 numbers, so all of them are included in the top 5.

Input 2:
5 2 3 4 -10 30 40 50 20 50 60 60 51

Output 2:
60 60 51 50 50

Comment 2:
Average number = 28.08.
Numbers greater than 28.08 are:
{30, 40, 50, 50, 60, 60, 51}.
The top 5 numbers among them in descending order are: {60, 60, 51, 50, 50}.

Input 3:
1

Output 3:
No

Comment 3:
Average number = 1.
There are no numbers greater than 1.

Input 4:
-1 -2 -3 -4 -5 -6

Output 4:
-1 -2 -3

Comment 4:
Average number = -3.5.
Numbers greater than -3.5 are: {-1, -2, -3}.
The top 5 numbers among them in descending order are: {-1, -2, -3}.