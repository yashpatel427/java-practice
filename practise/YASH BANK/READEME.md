# Yash Bank

A console-based banking application built using Core Java.

## Features

- Customer registration
- Bank account creation
- Login with PIN authentication
- Deposit money
- Withdraw money
- Transfer money
- Check balance
- Transaction history
- Change PIN
- Delete account
- Persistent data storage using files
- Transaction ID generation
- Input validation

## Technologies

- Java
- Object-Oriented Programming
- ArrayList
- File Handling
- Exception Handling
- Java Date & Time API

## How to Run

1. Make sure Java is installed on your computer.
2. Open the project in VS Code or another Java IDE.
3. Compile the Java files.
4. Run the `Main` class.
5. Follow the instructions shown in the console.

The application automatically saves account and transaction data to text files.

## Project Structure

YashBank/
│
├── main.java
├── Customer.java
├── BankAccount.java
├── YashBankData.txt
├── YashBankTransactions.txt
├── README.md
└── .gitignore

## Future Improvements

- Connect the application to MySQL using JDBC
- Replace file storage with a database
- Add a graphical/web interface
- Add user roles such as Admin and Customer
- Add stronger security for PINs and sensitive data
- Build a REST API using Spring Boot