DROP TABLE IF EXISTS users; 

CREATE TABLE users(
userid int PRIMARY KEY AUTO_INCREMENT,
email varchar(50) NOT NULL,
password varchar(50) NOT NULL,
mobile varchar(50) NOT NULL,
address varchar(50) NOT NULL,
token LONGTEXT,
image varchar(50));

INSERT INTO users(email, password, mobile, address)
VALUES("amy@email.com", "amypassword123", "11111111", "Tampines"),
("brenda@email.com", "brendapassword123", "22222222", "Pasir Ris"),
("charlie@email.com", "charliepassword123", "33333333", "Bedok"),
("denise@email.com", "denisepassword123", "44444444", "Clementi"),
("elena@email.com", "elenapassword123", "55555555", "Jurong"),
("fiona@email.com", "fionapassword123", "66666666", "Bukit Panjang"),
("groot@email.com", "grootpassword123", "77777777", "Woodlands"),
("helen@email.com", "helenpassword123", "88888888", "Admiralty"),
("iris@email.com", "irispassword123", "99999999", "Yishun");

SELECT * FROM users;