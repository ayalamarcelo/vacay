<h1 align="center">Employee Vacation System</h1>

`ConsultSystem` is a simple vacation system for employees. It calculates the number of vacation days based on the employee's years of service and category code. The program supports three categories: Commerce (Code 1), Gastronomy (Code 2), and Banking (Code 3).

<p align="left">Table of Contents:</p>

- [How to Use:](#how-to-use)
- [Categories and Vacation Days](#categories-and-vacation-days)
- [Error Handling](#error-handling)

## How to Use:

- Run the program by executing the ConsultSystem class.
- Follow the prompts to provide information about the employee,  including their name, years of service, and category code.

```
# Example Usage
What is the name of the employee?: John Doe

How many years of service does the employee have?: 5

# Codes: Commerce 1, Gastronomy 2, Banking 3
What is the category code?: 1

The program will validate the input, calculate the vacation days, and display a summary of the inquiry.
```
**Output example:**

```java
// Summary of the inquiry:
Name: John Doe
Years of service: 5
Vacation days: 14
```
## Categories and Vacation Days

- Commerce (Code 1):
        1 year: 6 days
        2 to 6 years: 14 days
        7 or more years: 20 days

- Gastronomy (Code 2):
        1 year: 7 days
        2 to 6 years: 15 days
        7 or more years: 22 days

- Banking (Code 3):
        1 year: 10 days
        2 to 6 years: 20 days
        7 or more years: 30 days

## Error Handling

    The program handles input validation, ensuring that the years of service and category code are valid.
    If an invalid input is detected, an error message is displayed, and the user is prompted to enter valid values.

>[!Note]
> Optionally, you can make another inquiry. Enter "Yes" to continue or "No" to exit the program.