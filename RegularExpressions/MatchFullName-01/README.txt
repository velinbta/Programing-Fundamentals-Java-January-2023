1. Match Full Name
Write a Java Program to match full names from a list of names and print them on the console.

Writing the Regular Expression
Write a regular expression to match a valid full name, according to these conditions:
A valid full name has the following characteristics:
It consists of two words.
Each word starts with a capital letter.
After the first letter, it only contains lowercase letters afterward.
Each of the two words should be at least two letters long.
The two words are separated by a single space.

Examples:

Input 1:
Ivan Ivanov, Ivan ivanov, ivan Ivanov, IVan Ivanov, Georgi Georgiev, Ivan	Ivanov

Output 1:
Ivan Ivanov Georgi Georgiev

Input 2:
peter georgiev, peter Georgiev, Peter GeoRgiev, PEter GEorgiev, Peter Georgiev, Anna Petrova

Output 2:
Peter Georgiev Anna Petrova