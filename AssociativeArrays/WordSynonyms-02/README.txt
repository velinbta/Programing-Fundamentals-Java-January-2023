2. Word Synonyms
Write a program that keeps a map with synonyms. The key of the map will be the word. The value will be a list of all the synonyms of that word. You will be given a number n. On the next 2 * n lines you will be given a word and a synonym each on a separate line like this:
{word}
{synonym}

If you get the same word for the second time, just add the new synonym to the list. 
Print the words in the following format:
{word} - {synonym1, synonym2 .... synonymN}

Examples:

Input 1:
3
cute
adorable
cute
charming
smart
clever

Output 1:
cute - adorable, charming
smart - clever

Input 2:
2
task
problem
task
assignment

Output 2:
task - problem, assignment