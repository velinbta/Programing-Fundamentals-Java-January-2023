7. Theatre Promotions
A theatre is having a ticket sale, but they need a program to calculate the price of a single ticket. If the given age does not fit one of the categories, you should print "Error!". You can see the prices in the table below:

Day / Age	0 <= age <= 18	18 < age <= 64	64 < age <= 122
Weekday	12$	18$	12$
Weekend	15$	20$	15$
Holiday	5$	12$	10$

Input
The input comes in two lines. On the first line, you will receive the type of day. On the second - is the age of the person.

Output
Print the ticket price according to the table, or "Error!" if the age is not in the table.

Constraints
The age will be in the interval [-1000 ....1000].
The type of day will always be valid.

Examples:

Input 1:
Weekday
42

Output 1:
18$

Input 2:
Holiday
-12

Output 2:
Error!

Input 3:
Holiday
15

Output 3:
5$

Input 4:
Weekend
122

Output 4:
15$