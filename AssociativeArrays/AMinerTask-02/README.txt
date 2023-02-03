2. A Miner Task
Until you receive the "stop" command, you will be given a sequence of strings, each on a new line. Every odd line on the console is representing a resource (e.g. Gold, Silver, Copper, etc.) and every even - quantity. Your task is to collect the resources and print them each on a new line.

Print the resources and their quantities in format: "{resource} -> {quantity}".
The quantities inputs will be in the range [1 .... 2 000 000 000].

Examples:

Input 1:
Gold
155
Silver
10
Copper
17
stop

Output 1:
Gold -> 155
Silver -> 10
Copper -> 17

Input 2:
gold
155
silver
10
copper
17
gold
15
stop

Output 2:
gold -> 170
silver -> 10
copper -> 17