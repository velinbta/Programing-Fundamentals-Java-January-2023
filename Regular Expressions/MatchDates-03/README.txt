3. Match Dates
Write a program, which matches a date in the format "dd{separator}MMM{separator}yyyy". Use named capturing groups in your regular expression.

Compose the Regular Expression
Every valid date has the following characteristics:
Always starts with two digits, followed by a separator.
After that, it has one uppercase and two lowercase letters (e.g. Jan, Mar).
After that, it has a separator and exactly 4 digits (for the year).
The separator could be either of three things: a period ("."), a hyphen ("-") or a forward-slash ("/").
The separator needs to be the same for the whole date (e.g. 13.03.2016 is valid, 13.03/2016 is NOT). Use a group back reference to check for this.

Examples:

Input 1:
13/Jul/1928, 10-Nov-1934, , 01/Jan-1951,f 25.Dec.1937 23/09/1973, 1/Feb/2016

Output 1:
Day: 13, Month: Jul, Year: 1928
Day: 10, Month: Nov, Year: 1934
Day: 25, Month: Dec, Year: 1937

Input 2:
01/Jan-1951 29/Feb/2024 1/Jan-1951 27-Feb-2007 1/Jan-1951 1/Mar/2016 23/october/197

Output 2:
Day: 29, Month: Feb, Year: 2024
Day: 27, Month: Feb, Year: 2007