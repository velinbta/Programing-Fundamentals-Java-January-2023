3. Heroes of Code and Logic VII
Problem for exam preparation for the Programming Fundamentals Course @SoftUni.
Link: https://judge.softuni.org/Contests/Practice/Index/2303#0.

You got your hands on the most recent update on the best MMORPG of all time - Heroes of Code and Logic. You want to play it all day long! So cancel all other arrangements and create your party!
On the first line of the standard input, you will receive an integer n - the number of heroes that you can choose for your party. On the next n lines, the heroes themselves will follow with their hit points and mana points separated by a single space in the following format: 
"{hero name} {HP} {MP}"
HP stands for hit points and MP for mana points
a hero can have a maximum of 100 HP and 200 MP

After you have successfully picked your heroes, you can start playing the game. You will be receiving different commands, each on a new line, separated by " - ", until the "End" command is given. 
There are several actions that the heroes can perform:

"CastSpell - {hero name} - {MP needed} - {spell name}"
If the hero has the required MP, he casts the spell, thus reducing his MP. Print this message: 
"{hero name} has successfully cast {spell name} and now has {mana points left} MP!"
If the hero is unable to cast the spell print:
"{hero name} does not have enough MP to cast {spell name}!"

"TakeDamage - {hero name} - {damage} - {attacker}"
Reduce the hero HP by the given damage amount. If the hero is still alive (his HP is greater than 0) print:
"{hero name} was hit for {damage} HP by {attacker} and now has {current HP} HP left!"
If the hero has died, remove him from your party and print:
"{hero name} has been killed by {attacker}!"

"Recharge - {hero name} - {amount}"
The hero increases his MP. If it brings the MP of the hero above the maximum value (200), MP is increased to 200. (the MP can't go over the maximum value).
Print the following message:
"{hero name} recharged for {amount recovered} MP!"

"Heal - {hero name} - {amount}"
The hero increases his HP. If a command is given that would bring the HP of the hero above the maximum value (100), HP is increased to 100 (the HP can't go over the maximum value).
Print the following message:
"{hero name} healed for {amount recovered} HP!"

Input
On the first line of the standard input, you will receive an integer n
On the following n lines, the heroes themselves will follow with their hit points and mana points separated by a space in the following format
You will be receiving different commands, each on a new line, separated by " - ", until the "End" command is given

Output
Print all members of your party who are still alive, in the following format (their HP/MP need to be indented 2 spaces):
"{hero name}
  HP: {current HP}
  MP: {current MP}"

Constraints
The starting HP/MP of the heroes will be valid, 32-bit integers will never be negative or exceed the respective limits.
The HP/MP amounts in the commands will never be negative.
The hero names in the commands will always be valid members of your party. No need to check that explicitly.

Examples:

Input 1:
2
Solmyr 85 120
Kyrre 99 50
Heal - Solmyr - 10
Recharge - Solmyr - 50
TakeDamage - Kyrre - 66 - Orc
CastSpell - Kyrre - 15 - ViewEarth
End

Output 1:
Solmyr healed for 10 HP!
Solmyr recharged for 50 MP!
Kyrre was hit for 66 HP by Orc and now has 33 HP left!
Kyrre has successfully cast ViewEarth and now has 35 MP!
Solmyr
  HP: 95
  MP: 170
Kyrre
  HP: 33
  MP: 35

Input 2:
4
Adela 90 150
SirMullich 70 40
Ivor 1 111
Tyris 94 61
Heal - SirMullich - 50
Recharge - Adela - 100
CastSpell - Tyris - 1000 - Fireball
TakeDamage - Tyris - 99 - Fireball
TakeDamage - Ivor - 3 - Mosquito
End

Output 2:
SirMullich healed for 30 HP!
Adela recharged for 50 MP!
Tyris does not have enough MP to cast Fireball!
Tyris has been killed by Fireball!
Ivor has been killed by Mosquito!
Adela
  HP: 90
  MP: 200
SirMullich
  HP: 100
  MP: 40

Comment 2:
Heal - SirMullich healed for 30 HP due to the HP max limit.
Recharge - Adela recharged for 50 MP due to the MP max limit.
CastSpell - Tyris does not have enough MP to cast the spell.
TakeDamage - Tyris's HP is reduced by 99, thus becoming -5, which means he is dead.
TakeDamage - Ivor's HP is now -2, so he is dead too.
After the "End" command, we print the remaining living heroes.