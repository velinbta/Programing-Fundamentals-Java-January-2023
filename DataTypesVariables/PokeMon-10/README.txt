10. *Poke Mon
A Poke Mon is a special type of pokemon which likes to Poke others. But at the end of the day, the Poke Mon wants to keep statistics, about how many pokes it has managed to make.
The Poke Mon pokes his target and then proceeds to poke another target. The distance between his targets reduces his poke power.

You will be given the poke power the Poke Mon has, N - an integer.
Then you will be given the distance between the poke targets, M - an integer.
Then you will be given the exhaustionFactor Y - an integer.

Your task is to start subtracting M from N until N becomes less than M, i.e. the Poke Mon does not have enough power to reach the next target. 
Every time you subtract M from N that means you have reached a target and poked it successfully. COUNT how many targets you have poked - you will need that count.
The Poke Mon becomes gradually more exhausted. IF N becomes equal to EXACTLY 50 % of its original value, you must divide N by Y, if it is POSSIBLE. This DIVISION is between integers.

If a division is not possible, you should NOT do it. Instead, you should continue subtracting.
After dividing, you should continue subtracting from N, until it becomes less than M.
When N becomes less than M, you must take what has remained of N and the count of targets you have poked, and print them as output.

NOTE: When you are calculating percentages, you should be PRECISE at maximum.
Example: 505 is NOT EXACTLY 50 % from 1000, its 50.5 %.

Input
The input consists of 3 lines.
On the first line, you will receive N - an integer.
On the second line, you will receive M - an integer.
On the third line, you will receive Y - an integer.

Output
The output consists of 2 lines.
On the first line, print what has remained of N, after subtracting from it.
On the second line, print the count of targets, you have managed to poke.

Constrains
The integer N will be in the range [1, 2.000.000.000].
The integer M will be in the range [1, 1.000.000].
The integer Y will be in the range [0, 9].
Allowed time / memory: 16 MB / 100ms.

Examples:

Input 1:
5
2
3

Output 1:
1
2

Comment 1:
N = 5, M = 2, Y = 3.
We start subtracting M from N.
N - M = 3. 1 target poked.
N - M = 1. 2 targets poked.
N < M.
We print what has remained of N, which is 1.
We print the count of targets, which is 2.

Input 2:
10
5
2

Output 2:
2
1

Comment 2:
N = 10, M = 5, Y = 2.
We start subtracting M from N.
N - M = 5. (N is still not less than M, they are equal).
N became EXACTLY 50 % of its original value.
5 is 50 % from 10. So we divide N by Y.
N / Y = 5 / 2 = 2. (INTEGER DIVISION).