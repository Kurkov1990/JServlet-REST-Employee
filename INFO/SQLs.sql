-- Створення бази даних
CREATE DATABASE employee_db;

-- Створення таблиці employees
CREATE TABLE IF NOT EXISTS employees
( id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  position VARCHAR(255) NOT NULL,
  phone VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);


