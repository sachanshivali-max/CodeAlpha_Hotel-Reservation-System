# CodeAlpha_Hotel-Reservation-System
# Hotel Reservation System 🏨
​A robust, Object-Oriented console application designed to manage, book, and cancel hotel room reservations efficiently. This system utilizes file-based storage to ensure data persistence and simulates real-world hotel operations.

​## 📋 Table of Contents

--​Project Overview
​--Key Features
​--Architecture
​--Prerequisites
​--Installation & Usage
​--Data Persistence

​## 📖 Project Overview

​This project is a functional prototype for a Hotel Management System. Its goal is to demonstrate the application of Object-Oriented Programming (OOP) principles to create a scalable and efficient system for managing room availability and guest reservations.

## ​✨ Key Features
- **​Room Categorization**: Distinguishes between room types such as Standard, Deluxe, and Suite.
- **​Booking Management**: Allows users to easily search for room availability and finalize bookings.
​- **Reservation Cancellation**: Enables users to cancel existing reservations using a unique Booking ID.
- **​Payment Simulation**: Includes a simulated payment processing workflow upon booking.
​Data Persistence: Saves all booking records to a text file (bookings.txt) to prevent data loss.

​## **Architecture** 🏗️
- **​OOP Design**: Utilizes Room and Booking classes to model system entities.
- **​File I/O:** Implements FileWriter and PrintWriter for persistent data storage on the local disk.
- **​Collections**: Leverages Java's ArrayList to manage room inventory and active bookings in memory.

​## 🛠️ **Prerequisites**
- **​JDK**: Java Development Kit (JDK 8 or higher).
- **​IDE**: IntelliJ IDEA, Eclipse, VS Code, or any standard text editor.

​## 🚀 **Installation & Usage**
1. Copy the source code into a file named
  HotelReservation.java.
2. Open your terminal or command prompt int the project directory.
3. Compile the program:
  javac HotelReservation.java.
4. Execute the program:
  java HotelReservation.

## 💾 Data Persistence
​All bookings are automatically saved to a file named bookings.txt in a CSV-like format:
[BookingID], [GuestName], [RoomID]
​Developed as a Java learning project.      