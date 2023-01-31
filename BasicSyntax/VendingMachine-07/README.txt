7. Vending Machine
Your task is to calculate the total purchase price from a vending machine. Until you receive "Start" you will be given different coins that are being inserted into the machine. You have to sum them to have the total money inserted. There is a problem though. Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins. If someone tries to insert some other coins, you have to display "Cannot accept {money}", where the value is formatted to the second digit after the decimal point and not add it to the total money. On the next few lines until you receive "End" you will be given products to purchase. Your machine has, however, only "Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively. If the person tries to purchase a not existing product, print "Invalid product". Be careful that the person may try to purchase a product for which he doesn't have money. In that case, print "Sorry, not enough money". If the person purchases a product successfully print "Purchased {product name}". After the "End" command, print the money that is left formatted to the second decimal point in the format "Change: {money left}".

Examples:

Input 1:
1
1
0.5
0.6
Start
Coke
Soda
Crisps
End

Output 1:
Cannot accept 0.60
Purchased Coke
Purchased Soda
Sorry, not enough money
Change: 0.70

Input 2:
1
Start
Nuts
Coke
End

Output 2:
Sorry, not enough money
Purchased Coke
Change: 0.00