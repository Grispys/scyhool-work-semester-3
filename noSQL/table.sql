-- Active: 1727266944885@@127.0.0.1@5432
CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    first_name, TEXT,
    last_name, TEXT,
    email TEXT UNIQUE NOT NULL,
    enrollment_date DATE,
);