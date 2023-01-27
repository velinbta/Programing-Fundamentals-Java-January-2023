1. Furniture
Write a program to calculate the total cost of different types of furniture. You will be given some lines of input until you receive the line "Purchase". For the line to be valid it should be in the following format:

">>{furniture name}<<{price}!{quantity}"

The price can be a floating-point number or a whole number. Store the names of the furniture and the total price. At the end print each bought furniture on a separate line in the format:

"Bought furniture:
{1st name}
{2nd name}
..."

And on the last line print, the following: "Total money spend: {spend money}" formatted to the second decimal point.

Examples:

Input 1:
>>Sofa<<312.23!3
>>TV<<300!5
>Invalid<<!5
Purchase

Output 1:
Bought furniture:
Sofa
TV
Total money spend: 2436.69

Comment 1:
Only the Sofa and the TV are valid, for each of them we multiply the price by the quantity and print the result.	

Input 2:
>>TV<<312.23!3
>>Monitor<<300!5
>>Invalid<<<<!5
>>Sink<<220!10
>>>>>>Invalid<<!5
Purchase	

Output 2:
Bought furniture:
TV
Monitor
Sink
Total money spend: 4636.69