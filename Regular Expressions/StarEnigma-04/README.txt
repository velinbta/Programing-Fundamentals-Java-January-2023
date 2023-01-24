4. *Star Enigma
The war is at its peak, but you, young Padawan, can turn the tides with your programming skills. You are tasked to create a program to decrypt the messages of The Order and prevent the death of hundreds of lives. 
You will receive several messages, which are encrypted using the legendary star enigma. You should decrypt the messages, following these rules:
To properly decrypt a message, you should count all the letters [s, t, a, r] – case insensitive and remove the count from the current ASCII value of each symbol of the encrypted message.

After decryption:
Each message should have a planet name, population, attack type ('A', as an attack or 'D', as destruction), and soldier count.
The planet name starts after '@' and contains only letters from the Latin alphabet. 
The planet population starts after ':' and is an Integer;
The attack type may be "A"(attack) or "D"(destruction) and must be surrounded by "!" (Exclamation mark).
The soldier count starts after "->" and should be an Integer.
The order in the message should be: planet name -> planet population -> attack type -> soldier count. Each part can be separated from the others by any character except: '@', '-', '!', ':' and '>'.

Input / Constraints
The first line holds n – the number of messages – integer in the range [1…100].
On the next n lines, you will be receiving encrypted messages.

Output
After decrypting all messages, you should print the decrypted information in the following format:
First print the attacked planets, then the destroyed planets.
"Attacked planets: {attackedPlanetsCount}"
"-> {planetName}"
"Destroyed planets: {destroyedPlanetsCount}"
"-> {planetName}"
The planets should be ordered by name alphabetically.

Examples:

Input 1:
2
STCDoghudd4=63333$D$0A53333
EHfsytsnhf?8555&I&2C9555SR

Output 1:
Attacked planets: 1
-> Alderaa
Destroyed planets: 1
-> Cantonica

Comment 1:
We receive two messages, to decrypt them we calculate the key:
The first message has decryption key 3. So we subtract from each character's code 3.
PQ@Alderaa1:30000!A!->20000
The second message has key 5.
@Cantonica:3000!D!->4000NM
Both messages are valid and they contain planet, population, attack type and soldiers count. 
After decrypting all messages we print each planet according to the format given.

Input 2:
3
tt(''DGsvywgerx>6444444444%H%1B9444
GQhrr|A977777(H(TTTT
EHfsytsnhf?8555&I&2C9555SR

Output 2:
Attacked planets: 0
Destroyed planets: 2
-> Cantonica
-> Coruscant

Comment 2:
We receive three messages.
Message one is decrypted with key 4:
pp$##@Coruscant:2000000000!D!->5000
Message two is decrypted with key 7:
@Jakku:200000!A!MMMM
This is the invalid message, missing soldier count, so we continue.
The third message has key 5.
@Cantonica:3000!D!->4000NM