5. Kamino Factory
The clone factory in Kamino got another order to clone troops. But this time, you are tasked to find the best DNA sequence to use in the production.

You will receive the DNA length, and until you receive the command "Clone them!" you will be receiving DNA sequences of ones and zeroes, split by "!" (one or several).
You should select the sequence with the longest subsequence of ones. If there are several sequences with the same length of a subsequence of ones, print the one with the leftmost starting index, if there are several sequences with the same length and starting index, select the sequence with the greater sum of its elements.
After you receive the last command "Clone them!", you should print the collected information in the following format:
"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
"{DNA sequence, joined by space}"

Input / Constraints
The first line holds the length of the sequences - integer in the range [1...100].
On the next lines, until you receive "Clone them!" you will be receiving sequences (at least one) of ones and zeroes, split by "!" (one or several).

Output
The output should be printed on the console and consists of two lines in the following format:
"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
"{DNA sequence, joined by space}"

Examples:

Input 1:
5
1!0!1!1!0
0!1!1!0!0
Clone them!

Output 1:
Best DNA sample 2 with sum: 2.
0 1 1 0 0

Comment 1:
We receive 2 sequences with the same length of a subsequence of ones, but the second is printed because its subsequence starts at index[1].

Input 2:
4
1!1!0!1
1!0!0!1
1!1!0!0
Clone them!

Output 2:
Best DNA sample 1 with sum: 3.
1 1 0 1

Comment 2:
We receive 3 sequences. Both 1 and 3 have the same length of a subsequence of ones -> 2, and both start from the index[0], but the first is printed because its sum is greater.