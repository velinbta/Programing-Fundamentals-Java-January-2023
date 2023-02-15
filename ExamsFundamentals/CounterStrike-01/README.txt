1. Counter Strike
Link: https://judge.softuni.org/Contests/Practice/Index/2305#0
Write a program that keeps track of every won battle against an enemy. You will receive initial energy. Afterward, you will start receiving the distance you need to reach an enemy until the "End of battle" command is given, or you run out of energy.

The energy you need for reaching an enemy is equal to the distance you receive. Each time you reach an enemy, you win a battle, and your energy is reduced. Otherwise, if you don't have enough energy to reach an enemy, end the program and print: "Not enough energy! Game ends with {count} won battles and {energy} energy".
Every third won battle increases your energy with the value of your current count of won battles.
Upon receiving the "End of battle" command, print the count of won battles in the following format:
"Won battles: {count}. Energy left: {energy}"

Input / Constraints
On the first line, you will receive initial energy - an integer [1-10000].
On the following lines, you will be receiving the distance of an enemy - an integer [1-10000]

Output
The description contains the proper output messages for each case and the format they should be printed.

Examples:

Input 1:
100
10
10
10
1
2
3
73
10

Output 1:
Not enough energy! Game ends with 7 won battles and 0 energy

Comment 1:
The initial energy is 100. The first distance is 10, so we subtract 10 from 100, and we consider this a won battle. We are left with 90 energy. Next distance - 10, and 80 energy left.
Next distance - 10, 3 won battles and 70 energy, but since we have 3 won battles, we increase the energy with the current count of won battles, in this case - 3, and it becomes 73.
The last distance we receive - 10 is unreachable since we have 0 energy, so we print the appropriate message, and the program ends.

Input 2:
200
54
14
28
13
End of battle

Output 2:
Won battles: 4. Energy left: 94