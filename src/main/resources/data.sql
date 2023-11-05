CREATE DATABASE IF NOT EXISTS faTest;

CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL ,
    password VARCHAR(255)  NULL
);


CREATE TABLE IF NOT EXISTS users2 (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    firstname1 VARCHAR(255) NOT NULL,
    lastname2 VARCHAR(255) NOT NULL,
    email3 VARCHAR(255) NOT NULL ,
    password VARCHAR(255)  NULL
);


--INSERT INTO users (firstname, lastname, email, password) VALUES ('John', 'Doe', 'johndoe@example.com', 'password123');
