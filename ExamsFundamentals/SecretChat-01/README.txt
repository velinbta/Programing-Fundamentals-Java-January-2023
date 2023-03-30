1. Secret Chat
Problem for exam preparation for the Programming Fundamentals Course @SoftUni.
Link: https://judge.softuni.org/Contests/Practice/Index/2307#0.
You have plenty of free time, so you decide to write a program that conceals and reveals your received messages. Go ahead and type it in!

On the first line of the input, you will receive the concealed message. After that, until the "Reveal" command is given, you will receive strings with instructions for different operations that need to be performed upon the concealed message to interpret it and reveal its actual content. There are several types of instructions, split by ":|:"
"InsertSpace:|:{index}":
Inserts a single space at the given index. The given index will always be valid.
"Reverse:|:{substring}":
If the message contains the given substring, cut it out, reverse it and add it at the end of the message. 
If not, print "error".
This operation should replace only the first occurrence of the given substring if there are two or more occurrences.
"ChangeAll:|:{substring}:|:{replacement}":
Changes all occurrences of the given substring with the replacement text.

Input / Constraints
On the first line, you will receive a string with a message.
On the following lines, you will be receiving commands, split by ":|:".

Output
After each set of instructions, print the resulting string. 
After the "Reveal" command is received, print this message:
"You have a new text message: {message}"

Examples:

Input 1:
heVVodar!gniV
ChangeAll:|:V:|:l
Reverse:|:!gnil
InsertSpace:|:5
Reveal

Output 1:
hellodar!gnil
hellodarling!
hello darling!
You have a new text message: hello darling!

Comment 1:
ChangeAll:|:V:|:l
heVVodar!gniV -> hellodar!gnil (We replace all occurrences of "V" with "l")
Reverse:|:!gnil
hellodar!gnil -> !gnil -> ling! -> hellodarling! (We reverse !gnil to ling! And put it at the end of the string)
InsertSpace:|:5
hellodarling! -> hello.darling! (We insert a space at index 5)
Finally, after receiving the "Reveal" command, we print the resulting message.

Input 2:
Hiware?uiy
ChangeAll:|:i:|:o
Reverse:|:?uoy
Reverse:|:jd
InsertSpace:|:3
InsertSpace:|:7
Reveal

Output 2:
Howare?uoy
Howareyou?
error
How areyou?
How are you?
You have a new text message: How are you?