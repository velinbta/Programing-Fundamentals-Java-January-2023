2. Match Phone Number
Write a regular expression to match a valid phone number from Sofia. After you find all valid phones, print them on the console, separated by a comma and a space ", ".

Compose the Regular Expression
A valid number has the following characteristics:
It starts with "+359".
Then, it is followed by the area code (always 2).
After that, it is followed by the number itself:
The number consists of 7 digits (separated into two groups of 3 and 4 digits respectively). 
The different parts are separated by either a space or a hyphen ('-').

Examples:

Input 1:
+359 2 222 2222,359-2-222-2222, +359/2/222/2222, +359-2 222 2222 +359 2-222-2222, +359-2-222-222, +359-2-222-22222 +359-2-222-2222

Output 1:
+359 2 222 2222, +359-2-222-2222

Input 2:
+359 2 222 2222,359-2-222-2222, +359/2/222/2222, +359-2 222 2222 +359 2-222-2222, +359-2-222-222, +359-2-222-22222 +359-2-222-2222

Output 2:
+359 2 222 2222, +359-2-222-2222