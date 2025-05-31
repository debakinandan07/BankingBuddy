# BankingBuddy

A simple and interactive Java banking system for managing accounts, deposits, withdrawals, and transfers.

## Overview

VaultFlow is a beginner-friendly Java project that simulates basic banking operations. The system allows you to:
- Create customer accounts
- Deposit and withdraw money
- Transfer funds between accounts
- Track transaction history

This project is designed for educational purposes and demonstrates foundational object-oriented programming concepts in Java.

## Features

- **Account Creation**: Register customers with unique account numbers.
- **Deposits & Withdrawals**: Securely manage account balances.
- **Fund Transfers**: Easily transfer money between accounts.
- **Transaction Tracking**: Keep a count of all operations performed.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher

### Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/VaultFlow.git
   cd VaultFlow
   ```

2. Compile the Java files:
   ```bash
   javac BankingSystem/*.java
   ```

3. Run the main program:
   ```bash
   java BankingSystem.Test
   ```

## Project Structure

```
BankingSystem/
├── BankAccount.java
├── Customer.java
└── Test.java
```

- **BankAccount.java**: Handles core banking logic and transactions.
- **Customer.java**: Models the customer and links to their bank account.
- **Test.java**: Command-line interface for interacting with the banking system.

## Example Usage

The application will prompt for user input at each step:
```
Enter name and the account number
John Doe
1001
Initial Balance: 0.0
Enter the amount you want to deposit
500
Enter the amount you want to withdraw
200
Enter the name of the person whom you want to transfer
Jane Smith
Amount to be transferred:
100
Final Balance: 200.0
Total Transactions made: 3
```

## Contributing

Contributions are welcome! Please open issues or pull requests for improvements or bug fixes.

## License

This project is licensed under the MIT License.

---
Created by [debakinandan07](https://github.com/debakinandan07)
