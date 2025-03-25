CREATE DATABASE globalcode;
USE globalcode;

CREATE TABLE users (
    id INT(36) AUTO_INCREMENT PRIMARY KEY, -- ID gerado automaticamente
    authorName VARCHAR(255) NOT NULL, 
    email VARCHAR(255) UNIQUE NOT NULL,
	title         		VARCHAR(255) NOT NULL,
    description  		TEXT NOT NULL
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