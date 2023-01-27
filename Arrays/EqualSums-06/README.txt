6. Equal Sums
Write a program that determines if an element exists in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, their sum is considered to be 0. Print the index that satisfies the required condition or "no" if there is no such index.

Examples:

Input 1:
1 2 3 3

Output 1:
2

Comment 1:
At a[2] -> left sum = 3, right sum = 3
a[0] + a[1] = a[3]

Input 2:
1 2

Output 2:
no

Comment 2:
At a[0] -> left sum = 0, right sum = 2
At a[1] -> left sum = 1, right sum = 0
No such index exists

Input 3:
1

Output 3:
0

Comment 3:
At a[0] -> left sum = 0, right sum = 0

Input 4:
1 2 3

Output 4:
no

Comment 4:
No such index exists

Input 5:
10 5 5 99 3 4 2 5 1 1 4

Output 5:
3

Comment 5:
At a[3] -> left sum = 20, right sum = 20
a[0] + a[1] + a[2] = a[4] + a[5] + a[6] + a[7] + a[8] + a[9] + a[10]