# Banking Application

This is a simple console-based Java application that simulates a basic banking system. The application allows users to create a bank account with a custom account holder's name, account number, and initial balance. Users can also deposit funds and view their current balance. This project demonstrates fundamental Object-Oriented Programming (OOP) concepts like encapsulation, as well as user interaction via console input.

## Features

- **Account Creation**: Users can input their account holder's name, account number, and initial balance when creating a new account.
- **Deposit Funds**: Users can add a specified amount to their account balance.
- **Display Balance**: The application displays the account holder's name, account number, and current balance.

## Code Structure

The code is organized in a single Java class, `Banking`, within the `banking` package.

### Classes and Methods

- **Banking**: The main class that represents a bank account with the following attributes:
  - `name`: The name of the account holder (String)
  - `accountNumber`: The unique account number (int)
  - `balance`: The current balance in the account (double)

#### Constructor

- `public Banking(String name, int accountNumber, double balance)`: Initializes a `Banking` object with the account holder's name, account number, and initial balance.

#### Methods

- `public void deposit(double amount)`: Adds the specified `amount` to the balance if it's greater than zero. Displays a message indicating the deposit amount or an error message if the amount is invalid.
- `public void displayBalance()`: Displays the account holder's name, account number, and current balance.

#### Main Method

- `public static void main(String[] args)`: The entry point of the application. It collects user input for account creation and deposits, and displays the current balance.

## How to Run

1. **Compile and Run**:
   - Compile the program using the Java compiler:
     ```bash
     javac -d . Banking.java
     ```
   - Run the program:
     ```bash
     java banking.Banking
     ```

2. **User Prompts**:
   - Enter your account holder's name, account number, and initial balance when prompted.
   - Then, specify an amount to deposit.
   - The application will display the updated balance.

## Example Usage

```plaintext
Enter Account Holder's Name: Njabulo N
Enter Account Number: 12345
Enter Initial Balance: R524
Enter amount to deposit: R150.0

Deposited: R150.0
Account Holder: Njabulo N
Account Number: 12345
Current Balance: R674.0
