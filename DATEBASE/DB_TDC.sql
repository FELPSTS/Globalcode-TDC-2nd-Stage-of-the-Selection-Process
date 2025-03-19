CREATE DATABASE globalcode;
USE globalcode;

CREATE TABLE users (
	id 					INT AUTO_INCREMENT PRIMARY KEY,
	authorName 			VARCHAR(255) NOT NULL,
	email				VARCHAR(255) UNIQUE NOT NULL	
);

CREATE TABLE events (
    id           		INT AUTO_INCREMENT PRIMARY KEY,
    name         		VARCHAR(255) NOT NULL,
    description  		TEXT NOT NULL,
    date         		DATE NOT NULL
);

CREATE TABLE Event_proposal(
	id 					INT AUTO_INCREMENT PRIMARY KEY,
    title 				VARCHAR(255),
    description 		TEXT NOT NULL,
    dateproposal 		TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    owner_id			INT NOT NULL,
	FOREIGN KEY (owner_id) REFERENCES users(id)
);

Drop database globalcode;