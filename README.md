Tip Calculator for Android
=========

Tip Calculator is a straightforward, intuitive and fast way to calculate what amount to tip based on a given percentage.

Input parameters (unit)
-----
- Amount (currency): for example, the amount on a restaurant bill.
- Tip (percentage): in the United States, common tipping percentages are 10%, 15% and 20%

Output (unit)
-----
- Amount to tip (currency): the total tip amount to add to you bill. Note: the total amount to be paid is obtained by adding this number to your bill.


Use Cases
-----
- restaurant / bar / food+drink establishment

Technology Highlight
-----
- To automatically update the tip amount when the bill amount changes, a ```addTextChangedListener``` is set on the ```etBillAmount``` EditText field.


Potential Improvements:
-----
- Code refactor to conform to DRY principles.
