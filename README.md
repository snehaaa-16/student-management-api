# Student Management API

## Project Description

A secure REST API built using Spring Boot that supports user authentication using JWT and role-based authorization.

## Features

* User Registration & Login (JWT Authentication)
* Role-based Access Control (ADMIN, USER)
* Secure CRUD APIs for Students
* Global Exception Handling
* Password Encryption using Bcrypt

## Tech Stack

* Java 17
* Spring Boot
* Spring Security
* JWT (jjwt)
* MySQL
* JPA (Hibernate)

## Authentication Flow

1. Register user via `/auth/register`
2. Login via `/auth/login` → get JWT token
3. Use token in Authorization header:

   ```
   Bearer <token>
   ```
4. Access protected APIs

## API Endpoints

### Auth APIs

* POST `/auth/register`
* POST `/auth/login`

### Student APIs

* GET `/students` → USER, ADMIN
* POST `/students` → ADMIN only
* DELETE `/students/{id}` → ADMIN only

## How to Run

1. Clone repo
2. Configure MySQL in `application.properties`
3. Run Spring Boot app
4. Test APIs using Postman

## Author

Sneha Jaiswal
