CREATE DATABASE IF NOT EXISTS test;

USE test;

CREATE TABLE IF NOT EXISTS coffee (
    id INT PRIMARY KEY,
    coffee_name VARCHAR(100),
    price int
);

INSERT INTO coffee VALUES (1, 'Febary', 120);
INSERT INTO coffee VALUES (2, 'Royal', 190);
INSERT INTO coffee VALUES (2, 'Diamond', 180);
INSERT INTO coffee VALUES (3, 'Espresso', 900);
INSERT INTO coffee VALUES (2, 'Doppio', 120);
INSERT INTO coffee VALUES (2, 'Drip Coffee',80);
INSERT INTO coffee VALUES (2, 'Deaf Latte', 110);
