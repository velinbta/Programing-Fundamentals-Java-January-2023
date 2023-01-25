5. Bomb Numbers
Write a program that reads a sequence of numbers and a special bomb number with a certain power. Your task is to detonate every occurrence of the special bomb number and according to its power - his neighbors from left and right. Detonations are performed from left to right and all detonated numbers disappear. Finally, print the sum of the remaining elements in the sequence.

Examples:

Input 1:
1 2 2 4 2 2 2 9
4 2

Output 1:
12

Comment 1:
The special number is 4 with power 2. After detonation, we left with the sequence [1, 2, 9] with sum 12.

Input 2:
1 4 4 2 8 9 1
9 3

Output 2:
5

Comment 2:
The special number is 9 with power 3. After detonation, we left with the sequence [1, 4] with sum 5. Since the 9 has only 1 neighbor from the right we remove just it (one number instead of 3).

Input 3:
1 7 7 1 2 3
7 1

Output 3:
6

Comment 3:
Detonations are performed from left to right. We could not detonate the second occurrence of 7 because it�s already destroyed by the first occurrence. The numbers [1, 2, 3] survive. Their sum is 6.

Input 4:
1 1 2 1 1 1 2 1 1 1
2 1

Output 4:
4

Comment 4:
The red and yellow numbers disappear in two sequential detonations. The result is the sequence [1, 1, 1, 1]. Sum = 4.