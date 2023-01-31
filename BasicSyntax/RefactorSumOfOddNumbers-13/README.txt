13. Refactor Sum of Odd Numbers
You are assigned to find and fix the bugs in an existing piece of code, using the debugger. You should trace the program execution to find the lines of code that produce incorrect or unexpected results.

You are given a program (existing source code) that prints the next n odd numbers (starting from 1) and on the last row, prints the sum of them.

Examples:

Input 1:
5

Output 1:
1
3
5
7
9
Sum: 25

Input 2:
3

Output 2:
1
3
5
Sum: 9

Code:

Scanner sc = new Scanner(System.in);
int n = Integer.parseInt(sc.nextLine());
int sum = 1;
for (int i = 0; i <= n; i++) {
    System.out.print(2 * i + 1);
    sum += 2 * i;
}
System.out.printf("Sum: %d%n", sum);
