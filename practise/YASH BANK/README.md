# YASH BANK

A console-based banking application developed using Core Java.

YASH BANK is a simple banking system that allows users to create and manage bank accounts, perform transactions, view transaction history, and securely log in using a PIN.

## Features

- Create a new bank account
- Generate unique Customer IDs
- Generate unique Account Numbers
- Customer information management
- Account login with PIN verification
- Maximum 3 PIN login attempts
- Check account balance
- Deposit money
- Withdraw money
- Transfer money between accounts
- Prevent transfers to the same account
- Transaction history
- Automatic transaction ID generation
- Change account PIN
- Delete account
- Phone number validation
- Email validation
- Duplicate phone number prevention
- Duplicate email prevention
- Input validation
- File-based data storage
- Automatic loading of saved accounts and transactions
- Automatic saving of account and transaction data

## Technologies Used

- Java
- Core Java
- Object-Oriented Programming (OOP)
- ArrayList
- File Handling
- Exception Handling
- Regular Expressions
- Java Date and Time API
- Scanner for user input

## OOP Concepts Used

This project demonstrates several important Object-Oriented Programming concepts:

- Classes and Objects
- Encapsulation
- Constructors
- Getters and Setters
- Methods
- Static Methods
- Static Variables
- Object Relationships

## Project Structure

```text
YASH BANK/
│
├── Main.java
├── Customer.java
├── BankAccount.java
├── README.md
├── .gitignore
│
└── Data Files (created when the program runs)
    ├── YashBankData.txt
    └── YashBankTransactions.txt
```

## Main.java

Handles the main program flow and user interaction.

Responsibilities include:

- Main menu
- Login
- Bank menu
- Account creation
- Input handling
- Account selection
- Account deletion
- Customer and account ID generation

## Customer.java

Manages customer information.

Stores:

- Customer ID
- Name
- Phone number
- Email

Also handles:

- Customer creation
- Name validation
- Phone number validation
- Email validation
- Duplicate phone/email checking

## BankAccount.java

Handles bank account operations.

Responsibilities include:

- Account creation
- Account information
- Balance management
- Deposit
- Withdrawal
- Money transfer
- PIN verification
- PIN change
- Transaction history
- Account deletion
- Transaction ID generation
- Saving and loading account data
- Saving and loading transaction data

## How to Run

### Using Terminal

Open the terminal in the project folder:

```text
D:\Coding\practise\YASH BANK
```

Compile the Java files:

```bash
javac Main.java Customer.java BankAccount.java
```

Run the program:

```bash
java Main
```

### Using VS Code

Open `Main.java` in Visual Studio Code and click the **Run Code** button.

## Data Storage

The application uses text files to store data between program runs.

### YashBankData.txt

Stores customer and account information.

### YashBankTransactions.txt

Stores transaction history.

These files are excluded from GitHub using `.gitignore`.

## Input Validation

The application validates user input to prevent invalid data.

Examples:

- Menu choices must be valid integers
- Amounts must be valid numbers
- Deposit amount must be greater than zero
- Withdrawal amount must be greater than zero
- Withdrawal cannot exceed the account balance
- Transfer amount must be greater than zero
- Transfer cannot be made to the same account
- PIN must contain exactly 4 digits
- Phone number must contain exactly 10 digits
- Email must follow a valid format
- Duplicate phone numbers are rejected
- Duplicate email addresses are rejected

## Security Features

The project includes basic security features such as:

- PIN-based account login
- Maximum 3 incorrect PIN attempts
- PIN verification before changing the PIN
- PIN confirmation when changing the PIN
- PIN validation using regular expressions

> Note: This is an educational Core Java project and is not intended for handling real banking or financial data.

## Concepts Practiced

Through this project, I practiced:

- Java classes and objects
- Encapsulation
- Constructors
- Access modifiers
- Methods
- Static members
- ArrayList
- Loops
- Conditional statements
- Switch statements
- Input validation
- Regular expressions
- Exception handling
- File reading and writing
- Date and time handling
- Object relationships
- Basic data persistence
- Git and GitHub

## Future Improvements

Possible future improvements include:

- Database integration using JDBC
- MySQL database
- Improved PIN security
- Password hashing
- Admin login
- Multiple accounts per customer
- Interest calculation for savings accounts
- Transaction search and filtering
- Account statements
- GUI application
- Web application
- REST API

## Learning Outcome

This project was created to strengthen my Core Java and Object-Oriented Programming skills by building a practical application instead of only practicing individual Java concepts.

It helped me understand how different Java concepts can work together to create a complete application.

## Author

**Yash Patel**

## License

This project is created for educational and learning purposes.