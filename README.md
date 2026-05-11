# Online Payment Gateway System

## Project Description
The **Online Payment Gateway System** is a simple Java-based application that simulates an online payment process.  
It allows a customer to:

- Enter account details
- Check available balance
- Make a payment
- View transaction status

The system verifies whether the customer has sufficient balance before processing the payment.

---

## Features
- Customer account creation
- Display customer details
- Payment processing
- Balance verification
- Transaction confirmation
- Insufficient balance handling

---

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- Scanner Class for user input

---

## Classes Used

### 1. Customer
Stores customer information:
- Customer Name
- Account Number
- Account Balance

### 2. PaymentGateway
Handles:
- Payment processing
- Balance deduction
- Transaction validation

### 3. OnlinePaymentGateway
Main class that:
- Takes user input
- Creates objects
- Executes payment transactions

---

## How to Run the Project

### Step 1: Compile the program
```bash
javac OnlinePaymentGateway.java