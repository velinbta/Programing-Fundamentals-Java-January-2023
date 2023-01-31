7. String Explosion
Explosions are marked with ">". Immediately after the mark, there will be an integer, which signifies the strength of the explosion.
You should remove x characters (where x is the strength of the explosion), starting after the punched character (">").
If you find another explosion mark (">") while you are deleting characters, you should add the strength to your previous explosion.

When all characters are processed, print the string without the deleted characters. 
You should not delete the explosion character - ">", but you should delete the integers, which represent the strength.

Input
You will receive a single line with the string.

Output
Print what is left from the string after explosions.

Constraints
You will always receive strength for the punches.
The path will consist only of letters from the Latin alphabet, integers, and the char ">".
The strength of the punches will be in the interval [0....9].

Examples:

Input 1:
abv>1>1>2>2asdasd

Output 1:
abv>>>>dasd

Comment 1:
1st explosion is at index 3 and it is with a strength of 1. We delete only the digit after the explosion character. The string will look like this: abv>>1>2>2asdasd
2nd explosion is with strength one and the string transforms to this: abv>>>2>2asdasd
3rd explosion is now with a strength of 2. We delete the digit and we find another explosion. At this point, the string looks like this: abv>>>>2asdasd. 
4th explosion is with strength 2. We have 1 strength left from the previous explosion, we add the strength of the current explosion to what is left, and that adds up to a total strength of 3. We delete the next three characters and we receive the string abv>>>>dasd 
We do not have any more explosions and we print the result: abv>>>>dasd

Input 2:
peter>2sis>1a>2akarate>4hexmaster

Output 2:
peter>is>a>karate>master