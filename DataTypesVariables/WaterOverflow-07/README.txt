7. Water Overflow
You have a water tank with a capacity of 255 liters. 
On the next n lines, you will receive liters of water, which you have to pour into your tank. 
If the capacity is not enough, print "Insufficient capacity!" and continue reading the next line. On the last line, print the liters in the tank.

Input
The input will be on two lines:
On the first line, you will receive n - the number of lines, which will follow
On the next n lines - you receive quantities of water, which you have to pour into the tank

Output
Every time you do not have enough capacity in the tank to pour the given liters, print:
"Insufficient capacity!".
On the last line, print only the liters in the tank.

Constraints
n will be in the interval [1....20].
liters will be in the interval [1....1000].

Examples:

Input 1:
5
20
100
100
100
20

Output 1:
Insufficient capacity!
240

Input 2:
1
1000

Output 2:
Insufficient capacity!
0

Input 3:
7
10
20
30
10
5
10
20

Output 3:
105

Input 4:
4
250
10
20
40

Output 4:
Insufficient capacity!
Insufficient capacity!
Insufficient capacity!
250