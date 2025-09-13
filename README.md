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
  util->jdbc:build the connection
  dao->StudentDAO:include all crude operations
     Add Student: Insert new student records.
     View Students: Display all student records.
     Update Student: Modify existing records.
     Delete Student: Remove a student record.
  MainApp:include main method

5.How to Use:
execute the file. Menu will appear on the screen (1:insert record, 2:view record, 3:update record, 4:delete record, 5:exit). Enter the number according to your will. If you want insert student enter 1. Then it will ask the name and grade. Now you can enter records. Other crude operations also execute like this. Finally, enter 5 and exit from the system.

Database Name: studentdb
Table: studentData
Column	Data Type	Constraint
name	VARCHAR(59)	Not Null
grade	INT

6.Conclusion:
This project successfully demonstrates how to integrate Java applications with databases using JDBC.
