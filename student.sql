CREATE DATABASE smartstudent;

USE smartstudent;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    roll_no VARCHAR(20) UNIQUE NOT NULL,
    department VARCHAR(50),
    email VARCHAR(100),
    phone VARCHAR(15),
    marks DOUBLE
);
Database schema (student.sql)
