# SmartStudent: Java-Based Student Management System

## 📌 Project Overview
**SmartStudent** is a complete Student Management System built with **Java, JDBC, and MySQL**.  
It provides an **Admin Panel** where administrators can log in, manage student records, and perform CRUD operations.  
This project simulates real-world data-driven application development with optional GUI support via **Java Swing**.

---

## 🔧 Core Features

### 🔐 1. Admin Login System
- Static login credentials (default: `username: admin`, `password: admin123`)
- Console-based or Swing login form
- Input validation and restricted access

### 📋 2. Student Data Management (CRUD Operations)
- **Add** new student (Name, Roll No, Department, Email, Phone, Marks)
- **View** all students (table format in console)
- **Update** student info (search by Roll No or Name)
- **Delete** student record
- **Search** functionality (by Name, Department, or Roll No)

### 🔍 3. Search & Filter Feature
- Search by Roll Number
- Search by Department
- Search by Marks range (e.g., students with >80 marks)

### 📊 4. Statistics Module (Optional)
- Show total students
- Show highest/lowest marks
- Department-wise student count

### 💾 5. MySQL Database Integration
- **Table: `students`**
  - Fields: `id`, `name`, `roll_no`, `department`, `email`, `phone`, `marks`
- JDBC used for database connectivity and queries

---

## 🚀 Advanced Features (Optional Enhancements)
- GUI using **Java Swing** for desktop-like experience
- Login authentication from **MySQL** instead of static credentials
- Export student list to **Text/CSV file**
- Add subject-wise marks & calculate grades

---

## 🛠️ Tools & Technologies
- **Java (JDK 8 or later)**
- **JDBC**
- **MySQL** (XAMPP or Workbench)
- **Git & GitHub** (for version control and submission)
- *(Optional)* Java Swing for GUI

---

## 📁 Suggested Folder Structure

SmartStudent/
│
├── Main.java
├── DatabaseConnection.java
├── Student.java          # Model Class
├── StudentDAO.java       # Data Access Logic
├── AdminService.java     # CRUD Logic
├── UI.java               # Console UI or GUI
├── README.md
└── student.sql           # SQL schema


---
