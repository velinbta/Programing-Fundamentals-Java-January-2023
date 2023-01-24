1. Sum Adjacent Equal Numbers
Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.
After two numbers are summed, the obtained result could be equal to some of its neighbors and should be summed as well (see the examples below).
Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).

Examples:

Input 1:
3 3 6 1

Output 1:
12 1

Comment 1:
3 3 6 1 > 6 6 1 > 12 1

Input 2:
8 2 2 4 8 16

Output 2:
16 8 16

Comment 2:
8 2 2 4 8 16 > 8 4 4 8 16 > 8 8 8 16 > 16 8 16

Input 3:
5 4 2 1 1 4

Output 3:
5 8 4

Comment 3:
5 4 2 1 1 4 > 5 4 2 2 4 > 5 4 4 4 > 5 8 4

Input 4:
0.1 0.1 5 -5

Output 4:
0.2 5 -5

Comment 4:
0.1 0.1 5 -5 > 0.2 5 -5