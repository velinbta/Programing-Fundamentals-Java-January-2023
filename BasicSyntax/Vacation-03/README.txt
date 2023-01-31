3. Vacation
You are given a group of people, type of the group, on which day of the week they will stay. Based on that information, calculate how much they must pay and print that price on the console. Use the table below. In each cell is the price for a single person. The output should look like that: "Total price: {price}". The price should be formatted to the second decimal point.

		Friday		Saturday	Sunday
Students	8.45		9.80		10.46
Business	10.90		15.60		16
Regular		15		20		22.50

There are also discounts based on some conditions:
Students - if the group is bigger than or equal to 30 people, you should reduce the total price by 15%
Business - if the group is bigger than or equal to 100 people 10 of them can stay for free.
Regular - if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5% 

You should reduce the prices in that EXACT order.

Examples:

Input 1:
30
Students
Sunday

Output 1:
Total price: 266.73

Input 2:
40
Regular
Saturday

Output 2:
Total price: 800.00

Input 3:
50
Business
Friday

Output 3:
Total price: 545.00