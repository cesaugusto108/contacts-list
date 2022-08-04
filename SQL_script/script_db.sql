CREATE DATABASE ContactsList;
USE ContactsList;
SHOW TABLES;
CREATE TABLE Contacts (
	ID int primary key auto_increment,
    	CONTACT_NAME varchar(80) not null,
    	EMAIL varchar(80),
    	TELEPHONE bigint not null
);