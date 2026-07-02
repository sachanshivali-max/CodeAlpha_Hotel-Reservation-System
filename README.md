# CodeAlpha_Hotel-Reservation-System
# Hotel Reservation System 🏨
​A robust, Object-Oriented console application designed to manage, book, and cancel hotel room reservations efficiently. This system utilizes file-based storage to ensure data persistence and simulates real-world hotel operations.

​​<h2 style="font-weight: bold;">📋 Table of Contents</h2>
1. ​Project Overview
​2. Key Features
​3. Architecture
​4. Prerequisites
​5. Installation & Usage
​6. Data Persistence

​​<h2 style="font-weight: bold;">📖 Project Overview</h2>
​This project is a functional prototype for a Hotel Management System. Its goal is to demonstrate the application of Object-Oriented Programming (OOP) principles to create a scalable and efficient system for managing room availability and guest reservations.

## ​✨ Key Features
- **​Room Categorization**: Distinguishes between room types such as Standard, Deluxe, and Suite.
- **​Booking Management**: Allows users to easily search for room availability and finalize bookings.
​- **Reservation Cancellation**: Enables users to cancel existing reservations using a unique Booking ID.
- **​Payment Simulation**: Includes a simulated payment processing workflow upon booking.
​Data Persistence: Saves all booking records to a text file (bookings.txt) to prevent data loss.

​<h2 style="font-weight: bold;">🏗️ Architecture</h2> 
- **​OOP Design**: Utilizes Room and Booking classes to model system entities.
- **​File I/O:** Implements FileWriter and PrintWriter for persistent data storage on the local disk.
- **​Collections**: Leverages Java's ArrayList to manage room inventory and active bookings in memory.

​​<h2 style="font-weight: bold;">🛠️ Prerequisites</h2>
- **​JDK**: Java Development Kit (JDK 8 or higher).
- **​IDE**: IntelliJ IDEA, Eclipse, VS Code, or any standard text editor.

​​<h2 style="font-weight: bold;">🚀 Installation & Usage</h2>
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