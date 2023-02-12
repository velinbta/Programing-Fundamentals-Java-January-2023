3. Floating Equality
Write a program that safely compares floating-point numbers (double) with precision eps = 0.000001. Note that we cannot directly compare two floating-point numbers a and b by a==b because of the nature of the floating-point arithmetic. Therefore, we assume two numbers are equal if they are more close to each other than some fixed constant eps. 
You will receive two lines, each containing a floating-point number. Your task is to compare the values of the two numbers.

Examples:

Input 1:
5.3
6.01

Output 1:
False

Comment 1:
The difference of 0.71 is too big (> eps)

Input 2:
5.00000001
5.00000003

Output 2:
True

Comment 2:
The difference 0.00000002 < eps

Input 3:
5.00000005
5.00000001

Output 3:
True

Comment 3:
The difference 0.00000004 < eps

Input 4:
-0.0000007
0.00000007

Output 4:
True

Comment 4:
The difference 0.00000077 < eps

Input 5:
-4.999999
-4.999998

Output 5:
False

Comment 5:
Border case. The difference 0.0000001== eps. We consider the numbers are different.

Input 6:
4.999999
4.999998

Output 6:
False

Comment 6:
Border case. The difference 0.0000001== eps. We consider the numbers are different.