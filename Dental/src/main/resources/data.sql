CREATE TABLE IF NOT EXISTS clients(
	id INT NOT NULL AUTO_INCREMENT,
	dni VARCHAR(9) UNIQUE NOT NULL,
	name_surname VARCHAR(255) DEFAULT NULL,
	phone_number VARCHAR(15) DEFAULT NULL,
	email VARCHAR(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS odontologists(
	id INT NOT NULL AUTO_INCREMENT,
	dni VARCHAR(9) UNIQUE NOT NULL,
	name_surname VARCHAR(255) DEFAULT NULL,
	phone_number VARCHAR(15) DEFAULT NULL,
	email VARCHAR(255) NOT NULL,
	speciality VARCHAR(100) DEFAULT NULL,
	medical_license_no INT NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS visits(
	id INT NOT NULL AUTO_INCREMENT,
	client_id INT NOT NULL,
	odontologist_id INT NOT NULL,
	procedure_type VARCHAR(155) DEFAULT NULL,
	scheduled DATETIME DEFAULT CURRENT_TIMESTAMP,
	price DECIMAL(10,2) DEFAULT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (client_id) REFERENCES clients(id) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (odontologist_id) REFERENCES odontologists(id) ON UPDATE CASCADE ON DELETE CASCADE
);


INSERT INTO clients(dni, name_surname, phone_number, email) VALUES ('12345678A', 'Tony Stark', '609000001', 'ironman@gmail.com');
INSERT INTO clients(dni, name_surname, phone_number, email) VALUES ('12345678B', 'Steve Rogers', '609000002', 'capitanamerica@gmail.com');
INSERT INTO clients(dni, name_surname, phone_number, email) VALUES ('12345678C', 'Clint Barton', '609000003', 'ojodehalcon@gmail.com');
INSERT INTO clients(dni, name_surname, phone_number, email) VALUES ('12345678D', 'Bruce Banner', '609000004', 'hulk@gmail.com');
INSERT INTO clients(dni, name_surname, phone_number, email) VALUES ('12345678E', 'Natasha Romanoff', '609000005', 'viudanegra@gmail.com');
INSERT INTO clients(dni, name_surname, phone_number, email) VALUES ('12345678F', 'Thor Odinson', '609000006', 'thor@gmail.com');

INSERT INTO odontologists(dni, name_surname, phone_number, email, speciality, medical_license_no) VALUES ('12345678G', 'Tobey', '609000007', 'sipiderman@gmail.com', 'Surgery', 11111111);
INSERT INTO odontologists(dni, name_surname, phone_number, email, speciality, medical_license_no) VALUES ('12345678H', 'Andrew', '609000008', 'amazigspiderman@gmail.com', 'Orthodontics', 22222222);
INSERT INTO odontologists(dni, name_surname, phone_number, email, speciality, medical_license_no) VALUES ('12345678I', 'Tom', '609000009', 'spider_man@gmail.com', 'Pediatric Dentistry', 33333333);

INSERT INTO visits(client_id, odontologist_id, procedure_type, scheduled, price) VALUES (1, 1, 'Cleaning', '2022-04-25 09:05:00', 299.90);
INSERT INTO visits(client_id, odontologist_id, procedure_type, scheduled, price) VALUES (2, 1, 'Implant', '2022-04-25 10:00:00', 480.50);
INSERT INTO visits(client_id, odontologist_id, procedure_type, scheduled, price) VALUES (5, 2, 'Periodontal Treatment', '2022-04-25 13:20:00', 437.20);
INSERT INTO visits(client_id, odontologist_id, procedure_type, scheduled, price) VALUES (6, 3, 'Dental Filling', '2022-04-25 09:05:00', 100.40);