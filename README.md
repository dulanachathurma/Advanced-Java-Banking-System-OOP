# Advanced Java Banking System (OOP Project)

A fully modular Java application demonstrating advanced Object-Oriented Programming (OOP) principles through a complete banking system simulation.  
The project includes account management, withdrawals, overdraft processing, and simple/compound interest calculations, all organized with a clean multi-package architecture.

---

## ⭐ Key Features

### 🧩 Object-Oriented Design
- Interfaces (`Account`, `Display`, `InterestCalculator`)
- Abstract classes (`DepositAccount`, `LoanAccount`)
- Concrete classes (`SavingsAccount`, `CheckingAccount`)
- Method overriding and encapsulation

### 🧑‍💼 Person & Display System
- `Display` interface for standardized output  
- `Person` class implementing meaningful display formatting

### 🏦 Account Types

#### SavingsAccount
- Per-transaction withdrawal limit  
- Balance validation before withdrawal  

#### CheckingAccount
- Supports overdraft up to a limit  
- Applies overdraft fees  
- Allows negative balance under controlled conditions  

### 💰 Interest Calculation System
- `SimpleInterestCalculator` (linear growth)  
- `CompoundInterestCalculator` (exponential growth)  
- `AccountServices.applyInterest()` to deposit interest into any DepositAccount  

---

---

## ▶️ How to Run

1. Clone or download the project  
2. Open in IntelliJ IDEA or VS Code  
3. Confirm folder structure matches the layout above  
4. Compile and run `Main.java`  

---

## 🎯 Ideal For
- University OOP assignments  
- Java learners improving abstraction & inheritance  
- Portfolio projects  
- Banking system modeling practice  

---

## 👤 Author
**Dulana Chathurma**  
Software Engineering Undergraduate  
University of Kelaniya


