CREATE DATABASE IF NOT EXISTS test;

USE test;

CREATE TABLE IF NOT EXISTS coffee (
    id INT PRIMARY KEY,
    coffee_name VARCHAR(100),
    price DECIMAL(10, 2)
);

INSERT INTO coffee VALUES (1, 'Dark Roast', 100.00);
INSERT INTO coffee VALUES (2, 'Doppio', 120.00);
INSERT INTO coffee VALUES (3, 'Espresso', 90.00);
