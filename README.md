# 🏦 Bank Management System – Core Java Mini Project

## 📌 About The Project

This is a console-based **Bank Management System** built using **Core Java** as part of my daily Java development practice.

The main objective of this project is to strengthen my understanding of:

- Object-Oriented Programming (OOP)
- Layered Architecture
- Authentication Flow
- Data Modeling
- Java Collections Framework

This project simulates basic real-world banking operations such as registration, login, account creation, deposits, withdrawals, and balance management using in-memory storage.

---

## 🎯 Project Objective

As a final-year Computer Science student aiming for a **Backend Developer role**, I built this mini project to:

- Practice clean code structure
- Understand service-layer design
- Implement authentication logic
- Work with HashMap for O(1) data lookup
- Improve real-world problem solving using Java

This project reflects my consistent effort to improve my backend fundamentals through hands-on implementation.

---

## 🏗️ Architecture & Design

The project follows a layered architecture:

Client Layer      → Test.java (Menu-driven UI)  
Service Layer     → SBI (Implements RBI interface)  
Model Layer       → Register & Account classes  
Data Storage      → HashMap (Simulating a Database)

### 🔹 Design Principles Used

- Abstraction (RBI Interface)
- Encapsulation (Private fields + getters/setters)
- Composition (Register → Account relationship)
- Separation of Concerns
- O(1) Lookup using HashMap
- Menu-driven application flow

---

## 🚀 Features Implemented

### 👤 User Management
- User Registration with personal details
- Login Authentication
- Duplicate Username Handling
- Logout Flow

### 🏦 Account Management
- Create Bank Account
- Auto-generated Account Number
- Deposit Money
- Withdraw Money (with balance validation)
- Balance Check
- Display Complete User & Account Details

---

## 🧠 Authentication Flow

- Users are stored in a `HashMap<String, Register>`
- Username is used as the unique key
- Login validates the password before granting access
- Logged-in user object is passed to service-layer methods

This simulates how backend systems manage authentication and user sessions.

---

## 📂 Project Structure

com.braindata.bankmanagement  
│  
├── client  
│   └── Test.java  
│  
├── model  
│   ├── Register.java  
│   └── Account.java  
│  
├── service  
│   └── RBI.java  
│  
└── serviceImpl  
    └── SBI.java  

---

## 🛠️ Technologies Used

- Java (Core Java)
- OOP Principles
- Java Collections (HashMap)
- Console-based Interface

---

## 🔍 Sample Application Flow

1. Register User  
2. Login  
3. Create Account  
4. Deposit / Withdraw  
5. Check Balance  
6. Display Details  
7. Logout  

---

## 📈 Learning Outcomes

Through this project, I improved my understanding of:

- Object reference handling in Java
- Passing objects across application layers
- Designing small backend systems
- Managing state using in-memory data structures
- Avoiding NullPointerException through proper checks
- Implementing business logic inside service layer

---

## 🔮 Future Improvements

- Persistent Storage (File Handling / Database Integration)
- Spring Boot REST API version
- Multiple Accounts per User
- Password Strength Validation
- Transaction History Tracking
- Improved Exception Handling
- Proper Unique Account Number Generation Logic

---

## 👨‍💻 Author

**Saksham Pilane**  
Final Year B.Tech CSE Student  
Backend Developer

This project is part of my continuous Java learning journey and daily backend practice 🚀
