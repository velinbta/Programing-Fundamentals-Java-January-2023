10. *SoftUni Exam Results
Judge statistics on the last Programing Fundamentals exam were not working correctly, so you have the task to take all the submissions and analyze them properly. You should collect all the submissions and print the final results and statistics about each language that the participants submitted their solutions in.

You will be receiving lines in the following format: "{username}-{language}-{points}" until you receive "exam finished". You should store each username and their submissions and points. 
You can receive a command to ban a user for cheating in the following format: "{username}-banned". In that case, you should remove the user from the contest but preserve his submissions in the total count of submissions for each language.
After receiving "exam finished", print each of the participants in the following format:

"Results:
{username} | {points}
{username2} | {points}
...
{usernameN} | {points}"

After that, print each language, used in the exam in the following format:
"Submissions:
{language1} - {submissions_count}
{language2} - {submissions_count}
....
{language3} - {submissions_count}"

Input / Constraints
Until you receive "exam finished", you will be receiving participant submissions in the following format: "{username}-{language}-{points}"
You can receive a ban command -> "{username}-banned".
The points of the participant will always be a valid integer in the range [0-100].

Output
Print the exam results for each participant.
After that, print each language in the format shown above.
Allowed working time / memory: 100ms / 16MB.

Examples:

Input 1:
Peter-Java-84
George-C#-84
George-C#-70
Katy-C#-94
exam finished

Output 1:
Results:
Peter | 84
George | 84
Katy | 94
Submissions:
Java - 1
C# - 3

Input 2:
Peter-Java-91
George-C#-84
Katy-Java-90
Katy-C#-50
Katy-banned
exam finished

Output 2:
Results:
Peter | 91
George | 84
Submissions:
Java - 2
C# - 2