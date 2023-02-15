3. Memory Game
Link: https://judge.softuni.org/Contests/Practice/Index/2517#2

Write a program that recreates the Memory game.
On the first line, you will receive a sequence of elements. Each element in the sequence will have a twin. Until the player receives "end" from the console, you will receive strings with two integers separated by a space, representing the indexes of elements in the sequence.
If the player tries to cheat and enters two equal indexes or indexes which are out of bounds of the sequence, you should add two matching elements at the middle of the sequence in the following format:
"-{number of moves until now}a" 
Then print this message on the console:
"Invalid input! Adding additional elements to the board"

Input
On the first line, you will receive a sequence of elements.
On the following lines, you will receive integers until the command "end".

Output
Every time the player hit two matching elements, you should remove them from the sequence and print on the console the following message:
"Congrats! You have found matching elements - ${element}!"

If the player hit two different elements, you should print on the console the following message:
"Try again!"
If the player hit all matching elements before he receives "end" from the console, you should print on the console the following message: 
"You have won in {number of moves until now} turns!"
If the player receives "end" before he hits all matching elements, you should print on the console the following message:
"Sorry you lose :(
{the current sequence's state}"

Constraints
All elements in the sequence will always have a matching element.

Examples:

Input 1:
1 1 2 2 3 3 4 4 5 5 
1 0
-1 0
1 0 
1 0 
1 0 
end

Output 1:
Congrats! You have found matching elements - 1!
Invalid input! Adding additional elements to the board
Congrats! You have found matching elements - 2!
Congrats! You have found matching elements - 3!
Congrats! You have found matching elements - -2a!
Sorry you lose :(
4 4 5 5

Comment 1:
1)
1 0
1 1 2 2 3 3 4 4 5 5 -> 1 = 1, equal elements, so remove them. Moves: 1
2)
-1 0
-1 is invalid index, so we add additional elements
2 2 3 3 -2a -2a 4 4 5 5, Moves: 2
3)
1 0
2 2 3 3 -2a -2a 4 4 5 5 -> 2 = 2, equal elements, so remove them. Moves: 3
4)
1 0
3 3 -2a -2a 4 4 5 5 -> 3 = 3, equal elements, so remove them. Moves: 4
5)
1 0
-2a -2a 4 4 5 5 -> -2a = -2a, equal elements, so remove them. Moves: 5
6)
You receive the end command.
There are still elements in the sequence, so the player loses the game.
Final state - 4 4 5 5

Input 2:
a 2 4 a 2 4 
0 3 
0 2
0 1
0 1 
end

Output 2:
Congrats! You have found matching elements - a!
Congrats! You have found matching elements - 2!
Congrats! You have found matching elements - 4!
You have won in 3 turns!

Input 3:
a 2 4 a 2 4 
4 0 
0 2
0 1
0 1 
end

Output 3:
Try again!
Try again!
Try again!
Try again!
Sorry you lose :(
a 2 4 a 2 4