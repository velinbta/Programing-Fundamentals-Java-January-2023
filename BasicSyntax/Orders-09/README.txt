9. Orders
We are placing N orders at a time. You need to calculate the price on the following formula:
((daysInMonth * capsulesCount) * pricePerCapsule)

Input / Constraints
On the first line, you will receive integer N - the count of orders the shop will receive.
For each order, you will receive the following information:
Price per capsule - floating-point number in the range [0.00....1000.00].
Days - integer in the range [1...31].
Capsules count - integer in the range [0...2000].
The input will be in the described format, there is no need to check it explicitly.

Output
The output should consist of N + 1 line. For each order, you must print a single line in the following format:
"The price for the coffee is: ${price}"

On the last line, you need to print the total price in the following format:
"Total: ${totalPrice}"
The price must be formatted to 2 decimal places. 

Examples:

Input 1:
1
1.53
30
8

Output 1:
The price for the coffee is: $367.20
Total: $367.20

Comment 1:
We are given only 1 order. Then we  use the formulas:
orderPrice = 30 * 8 * 1.53 = 367.20

Input 2:
2
4.99
31
3
0.35
31
5

Output 2:
The price for the coffee is: $464.07
The price for the coffee is: $54.25
Total: $518.32