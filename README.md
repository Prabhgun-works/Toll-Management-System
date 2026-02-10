# Toll-Management-System
Java ecosystem–based Toll Management System that optimizes the process of charging tolls from vehicles by automating detection, pricing, and payment, reducing manual work and wait times.

Smart Toll Booth System (Java)

Overview

The Smart Toll Booth System is a Java-based MVP that simulates a real-world toll collection process using FASTag. The project focuses on clean architecture, core Java fundamentals, and industry-style separation of concerns.

This application processes vehicles, validates FASTag balances, deducts toll amounts, red-flags violations, and logs all transactions to a file.

⸻

Key Features
•	Vehicle and FASTag modeling using OOP principles
•	Toll payment processing with fixed toll amount
•	Red-flagging vehicles for rule violations
•	Custom checked exception handling
•	Persistent file-based logging
•	Clean package structure (model, service, util, exception)

⸻

Technology Stack
•	Language: Java 17 (LTS)
•	IDE: IntelliJ IDEA (Community Edition)
•	Libraries: Core Java (java.util, java.io, java.time)

⸻

Project Structure

com.tollsystem
│
├── model
│   ├── Vehicle.java
│   └── FastagAccount.java
│
├── service
│   └── TollService.java
│
├── exception
│   └── InsufficientBalanceException.java
│
├── util
│   └── FileLogger.java
│
└── Main.java


⸻

Class Responsibilities

Vehicle

Represents a vehicle entering the toll booth. Holds the vehicle number and associated FASTag account.

FastagAccount

Encapsulates FASTag balance and provides controlled balance deduction.

TollService

Contains core business logic for toll processing. Validates FASTag presence and balance, and throws exceptions on rule violations.

InsufficientBalanceException

Custom checked exception used to indicate toll payment failures with clear reasons.

FileLogger

Utility class responsible for persisting transaction logs to a file using file I/O.

Main

Application entry point. Handles object creation, invokes services, and manages success/failure flow.

⸻

Application Flow
1.	Vehicle and FASTag objects are created
2.	TollService processes the vehicle
3.	On success: toll is deducted and logged
4.	On failure: vehicle is red-flagged and reason is logged

⸻

Sample Output

Console Output:

Vehicle Red-Flagged
Reason: Insufficient FASTag balance

Log File (toll-log.txt):

2026-02-10T20:45 : FAILED | Vehicle: RJ14AB1234 | Reason: Insufficient FASTag balance


⸻

Design Principles Followed
•	Single Responsibility Principle
•	Encapsulation and composition
•	Separation of business logic and utilities
•	Exception-driven error handling

⸻

Interview Explanation (Short)

“I built a Java-based toll booth MVP that models vehicles and FASTag accounts using OOP. Business rules are handled in a service layer, violations are managed through custom checked exceptions, and all transactions are logged to a file for audit purposes. The project follows clean package separation and is designed to be easily extendable.”

⸻

Future Enhancements
•	Traffic simulation using Queue
•	Blacklisted vehicle detection
•	JUnit test cases
•	REST API using Spring Boot

⸻

Author

Prabhgun