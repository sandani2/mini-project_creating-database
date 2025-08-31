Mini Project – Student Database Application
1. Introduction:
This project is a console-based Java application developed using JDBC (Java Database Connectivity).
The system allows basic management of student records such as adding, viewing, updating, and deleting information stored in a MySQL database.
It demonstrates the integration of Java programming with a relational database through SQL queries.

2. Objectives:
To design and implement a simple student database management system.
To understand and apply the concepts of JDBC for database connectivity.
To perform CRUD operations (Create, Read, Update, Delete) using SQL commands through a Java application.

3.Software used:
JDK 8
IntelliJ IDEA
MySQL Server & MySQL Workbench
MySQL Connector/J (JDBC Driver)

4.Implementation:
The application consists of the following modules:
Database Connection Module – Establishes a connection with MySQL using JDBC.
Operations Module – Implements the following features:
  Add Student: Insert new student records.
  View Students: Display all student records.
  Update Student: Modify existing records.
  Delete Student: Remove a student record.

Database Name: studentdb
Table: studentData
Column	Data Type	Constraint
id	INT	Primary Key, Auto Increment
name	VARCHAR(59)	Not Null
age	INT	Not Null
grade	INT	Not Null

5.Conclusion:
This project successfully demonstrates how to integrate Java applications with databases using JDBC.
