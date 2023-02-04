2. Articles
Create an article class with the following properties:
Title - a string
Content - a string
Author - a string

The class should have a constructor and the following methods:
Edit (new content) - change the old content with the new one
ChangeAuthor (new author) - change the author
Rename (new title) - change the title of the article
override ToString - print the article in the following format: 
"{title} - {content}: {author}"

Write a program that reads an article in the following format "{title}, {content}, {author}". On the next line, you will get a number n. On the next n lines, you will get one of the following commands: "Edit: {new content}"; "ChangeAuthor: {new author}"; "Rename: {new title}". At the end, print the final article.

Examples:

Input 1:
some title, some content, some author
3
Edit: better content
ChangeAuthor:  better author
Rename: better title

Output 1:
better title - better content: better author

Input 2:
Holy Ghost, content, John Sandford
3
ChangeAuthor:  Mitch Albom
ChangeAuthor:  better author
ChangeAuthor:  Kim Heacox

Output 2:
Holy Ghost - content:  Kim Heacox