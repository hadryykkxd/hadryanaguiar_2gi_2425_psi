
CREATE DATABASE agendadb;

USE agendadb;

CREATE TABLE contactos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(255),
    aniversario DATE,
    telemovel VARCHAR(13)
);
    