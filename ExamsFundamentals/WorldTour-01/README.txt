1. World Tour
Link: https://judge.softuni.org/Contests/Practice/Index/2518#0

You are a world traveler, and your next goal is to make a world tour. To do that, you have to plan out everything first. To start with, you would like to plan out all of your stops where you will have a break.
On the first line, you will be given a string containing all of your stops. Until you receive the command "Travel", you will be given some commands to manipulate that initial string. The commands can be:

"Add Stop:{index}:{string}":
Insert the given string at that index only if the index is valid

"Remove Stop:{start-index}:{end-index}":
Remove the elements of the string from the starting index to the end index (inclusive) if both indices are valid

"Switch:{old_string}:{new_string}":
If the old string is in the initial string, replace it with the new one (all occurrences)

Note: After each command, print the current state of the string!
After the "Travel" command, print the following: "Ready for world tour! Planned stops: {string}"

Input / Constraints
JavaScript: you will receive a list of strings
An index is valid if it is between the first and the last element index (inclusive) (0 .... nth) in the sequence.

Output
Print the proper output messages in the proper cases as described in the problem description

Examples:

Input 1:
Hawai::Cyprys-Greece
Add Stop:7:Rome
Remove Stop:11:16
Switch:Hawai:Bulgaria
Travel

Output 1:
Hawai::RomeCyprys-Greece
Hawai::Rome-Greece
Bulgaria::Rome-Greece
Ready for world tour! Planned stops: Bulgaria::Rome-Greece

Input 2:
Albania:Bulgaria:Cyprus:Deuchland
Add Stop:3:Nigeria
Remove Stop:4:8
Switch:Albania: Az?rbaycan
Travel

Output 2:
AlbNigeriaania:Bulgaria:Cyprus:Deuchland
AlbNaania:Bulgaria:Cyprus:Deuchland
AlbNaania:Bulgaria:Cyprus:Deuchland
Ready for world tour! Planned stops: AlbNaania:Bulgaria:Cyprus:Deuchland