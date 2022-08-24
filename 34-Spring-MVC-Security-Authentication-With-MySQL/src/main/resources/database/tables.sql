<!--Tables--!>

create table spring_users(
USERNAME varchar(50) NOT NULL UNIQUE,
PASSWORD varchar(50) NOT NULL,
enabled INT NOT NULL Default 1
primary key(USERNAME),
);

create table spring_user_role(
USER_ROLE_ID INT NOT NULL UNIQUE AUTO_INCREMENT,
USERNAME varchar(50) NOT NULL,
ROLE varchar(20) NOT NULL,
primary key(USER_ROLE_ID),
foreign key (username) REFERENCES spring_users(username)
);

<!--Dummy value--!>

INSERT INTO SPRING_USERS(username, password, enabled)
VALUES('sunglowsys', '12345', true);
INSERT INTO SPRING_USERS(username, password, enabled)
VALUES('codingraja', '123456', true);

INSERT INTO SPRING_USER_ROLE(username, role)
VALUES('sunglowsys', 'ROLE_USER');
INSERT INTO SPRING_USER_ROLE(username, role)
VALUES('sunglowsys', 'ROLE_ADMIN');
INSERT INTO SPRING_USER_ROLE(username, role)
VALUES('codingraja', 'ROLE_USER');
