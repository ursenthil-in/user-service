CREATE TABLE user
(
	id integer NOT NULL,
	name varchar(255) NOT NULL, 
	age integer,  
	department varchar(100),
	dob timestamp,
	PRIMARY KEY(id) 
);


INSERT INTO USER (id, name, age, department, dob) VALUES (1001, 'SenthilNathan', 39, 'java', sysdate());
INSERT INTO USER (id, name, age, department, dob) VALUES (1002, 'Nachi', 27, 'testing', sysdate());
INSERT INTO USER (id, name, age, department, dob) VALUES (1003, 'Yogesh', 28, 'testing', sysdate());
INSERT INTO USER (id, name, age, department, dob) VALUES (1004, 'Muthu', 29, 'j2ee', sysdate());
