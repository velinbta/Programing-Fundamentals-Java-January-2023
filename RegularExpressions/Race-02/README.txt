2. Race
Write a program that processes information about a race. On the first line, you will be given a list of participants separated by ", ". On the next few lines until you receive a line "end of race" you will be given some info which will be some alphanumeric characters. In between them, you could have some extra characters which you should ignore. For example: "G!32e%o7r#32g$235@!2e". The letters are the name of the person and the sum of the digits is the distance he ran. So here we have George who ran 29 km. Store the information about the person only if the list of racers contains the name of the person. If you receive the same person more than once just add the distance to his old distance. At the end print the top 3 racers in the format:

"1st place: {first racer}
2nd place: {second racer}
3rd place: {third racer}"

Examples:

Input 1:
George, Peter, Bill, Tom
G4e@55or%6g6!68e!!@
R1@!3a$y4456@
B5@i@#123ll
G@e54o$r6ge#
7P%et^#e5346r
T$o553m&6
end of race

Output 1:
1st place: George
2nd place: Peter
3rd place: Tom

Comment 1:
On the 3rd input line, we have Ray. He is not on the list, so we do not count his result. The other ones are valid. George has a total of 55 km, Peter has 25, Bill has 11 and Tom has 19. 

Input 2:
Joro, George, Georgi, Stamat
^&^%^232St#$ama&&^^t
^&^%^232St#$ama&&^^t
G7667eorge&^^&^
&^&&&J99999oro&^^57
end of race

Output 2:
1st place: Joro
2nd place: George
3rd place: Stamat