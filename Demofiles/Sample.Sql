-- greet_user.sql
CREATE DATABASE IF NOT EXISTS greet_db;
USE greet_db;

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Insert a name into the table
INSERT INTO users (name) VALUES ('John Doe');

-- Retrieve and display the name
SELECT CONCAT('Hello, ', name, '!') AS greeting FROM users;
