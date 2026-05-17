# 🛞 Tire Inventory Management System

A Java-based inventory management system designed for automotive and tire shop environments.
It uses **MySQL + JDBC** for persistent data storage and provides a console-based interface for managing tire inventory efficiently.

---

## 📌 Features

* Add new tires to inventory
* View all stored tire records
* Search tires by brand
* Persistent data storage using MySQL
* JDBC database connectivity
* Console-based menu system
* Exception handling for invalid input
* Scalable structure for future upgrades

---

## 🧰 Technologies Used

* Java
* MySQL
* JDBC
* SQL
* MySQL Workbench
* Eclipse / IntelliJ IDEA
* Git & GitHub

---

## 📁 Project Structure

```
src/
│
├── Main.java
├── Tire.java
├── InventoryDB.java
└── DBConnection.java
```

---

## 🗄️ Database Setup

### 1. Create Database

```sql
CREATE DATABASE tire_shop;
```

---

### 2. Select Database

```sql
USE tire_shop;
```

---

### 3. Create Table

```sql
CREATE TABLE tires (
    id INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(100),
    size VARCHAR(50),
    price DOUBLE,
    quantity INT
);
```

---

## 👤 MySQL User Setup (Optional but Recommended)

```sql
CREATE USER 'javauser'@'localhost' IDENTIFIED BY 'password123';

GRANT ALL PRIVILEGES ON tire_shop.* TO 'javauser'@'localhost';

FLUSH PRIVILEGES;
```

---

## 🔌 JDBC Configuration

Update `DBConnection.java`:

```java
private static final String URL = "jdbc:mysql://localhost:3306/tire_shop";
private static final String USER = "javauser";
private static final String PASSWORD = "password123";
```

---

## ▶️ How to Run

### 1. Clone Repository

```bash
git clone https://github.com/yourusername/tire-inventory-system.git
```

### 2. Open in IDE

Open in:

* Eclipse
* IntelliJ IDEA

### 3. Add MySQL Driver

**Maven:**

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.4.0</version>
</dependency>
```

Or manually add the MySQL Connector JAR.

---

### 4. Run Application

Run:

```
Main.java
```

---

## 🧾 Menu Preview

```
--- Tire Inventory System ---
1. Add Tire
2. View Tires
3. Search Brand
4. Exit
```

---

## 🧪 Example Record

```
Brand: Michelin
Size: 205/55R16
Price: 120.99
Quantity: 10
```

---

## 🔍 Example SQL Query

```sql
SELECT * FROM tires;
```

---

## 🚀 Future Improvements

* Update and delete tire records
* Low-stock alerts
* Sales/POS system integration
* JavaFX GUI version
* REST API using Spring Boot
* User authentication system
* Export reports (CSV / Excel)

---

## 🎯 Learning Outcomes

This project demonstrates:

* Object-oriented programming (OOP)
* JDBC database integration
* SQL database design
* CRUD operations
* Exception handling
* Real-world inventory system architecture

---

## 👨‍💻 Author

**Dylan Grant**

GitHub: [https://github.com/DylanGrant590](https://github.com/DylanGrant590)
