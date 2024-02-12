/**
 * Author:  Jordi <ejordi.ayala@gmail.com>
 * Created: Feb 12, 2024
 */

CREATE DATABASE IF NOT EXISTS petsdb;

USE petsdb;

CREATE TABLE owners(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    address VARCHAR(200) NOT NULL
);

CREATE TABLE pets(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    pet_name VARCHAR(100) NOT NULL,
    dog_breed VARCHAR(100) NOT NULL,
    color VARCHAR(100) NOT NULL,
    allergic BOOL NOT NULL,
    special_attention BOOL NOT NULL,
    notes VARCHAR(255),
    id_owner INT NOT NULL,
    CONSTRAINT FK_PetOwner FOREIGN KEY (id_owner) REFERENCES owners(id)
);

SELECT * FROM pets;
SELECT * FROM owners;

SELECT p.*, o.name, o.phone, o.address
FROM pets AS p
INNER JOIN owners AS o
ON p.id_owner = o.id;