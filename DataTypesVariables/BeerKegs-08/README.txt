8. Beer Kegs
Write a program, which calculates the volume of n beer kegs. 
You will receive in total 3 * n lines. Every three lines will hold information for a single keg. 
First up is the model of the keg, after that is the radius of the keg, and lastly is the height of the keg.
Calculate the volume using the following formula: PI * r^2 * h. 

In the end, print the model of the biggest keg.

Input
You will receive 3 * n lines. Each group of lines will be on a new line:
First - model - string
Second - radius - floating-point number
Third - height - integer number

Output
Print the model of the biggest keg.

Constraints
n will be in the interval [1....10].
The radius will be a floating-point number in the interval [1......3.402823E+38].
The height will be an integer in the interval [1....2147483647].

Examples:

Input 1:
3
Keg 1
10
10
Keg 2
20
20
Keg 3
10
30

Output 1:
Keg 2

Input 2:
2
Smaller Keg
2.41
10
Bigger Keg
5.12
20

Output 2:
Bigger Keg