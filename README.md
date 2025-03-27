# ✈️ Airline Reservation and Travel Planner  

## 📌 Overview  
The **Airline Reservation and Travel Planner** is a Java-based application developed using NetBeans that enables users to book airline tickets, plan travel routes, and manage their itineraries efficiently. It provides a user-friendly interface and integrates essential features for seamless flight reservations.  

## 🚀 Getting Started  
Follow the steps below to download, set up, and run the project on your local machine.  

# 1️⃣ Prerequisites  
Ensure you have the following installed:  
- Java Development Kit (JDK 8+)  
- NetBeans IDE  
- MySQL Database (for storing user and flight data)  
- JDBC Connector for MySQL  

# 2️⃣ Clone the Repository  
```sh  
git clone https://github.com/your-username/repo-name.git  
cd repo-name  
```

# 3️⃣ Set Up the Database  
1. Open MySQL and create a new database:  
```sql  
CREATE DATABASE airline_reservation;  
```
2. Import the provided SQL file into MySQL:  
```sh  
mysql -u root -p airline_reservation < database.sql  
```
3. Update the database connection settings in the project:  
   - Locate `DatabaseConnection.java`  
   - Update the URL, username, and password  

# 4️⃣ Run the Application  
1. Open NetBeans and load the project.  
2. Build the project by selecting **Run > Clean and Build Project**.  
3. Run the application by selecting **Run > Run Project**.  

# 🎯 Features  
✔️ Flight search and reservation system  
✔️ User account management for booking history  
✔️ Dynamic fare calculation based on availability  
✔️ Database integration with MySQL  
✔️ Admin panel for managing flights and users  

# 🤝 Contributing  
Want to contribute? Follow these steps:  
1. Fork the repository  
2. Create a new branch:  
```sh  
git checkout -b feature-branch  
```
3. Commit your changes:  
```sh  
git commit -m "Added new feature"  
```
4. Push the branch:  
```sh  
git push origin feature-branch  
```
5. Open a Pull Request on GitHub  

Happy coding! ✈️🚀

