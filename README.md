# Rental Store Reservation System

## Overview

The Rental Store Reservation System is a Spring Boot application designed to manage rental reservations for various types of businesses, such as car rentals, property rentals, clothing rentals, and general product rentals. The application is designed using the Strategy design pattern to handle different reservation processes dynamically.

## Features

- **Dynamic Reservation Handling**: Supports multiple types of rentals using the Strategy design pattern.
- **REST API**: Provides endpoints for creating reservations.
- **JWT Authentication**: Secures API endpoints.
- **Flexible and Scalable**: Easily extendable for new types of rentals.

## Technologies

- Java 17
- Spring Boot 3.x
- Spring Security
- Hibernate (JPA)
- JWT (JSON Web Tokens)
- Maven

## Getting Started

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/andremiani/rentalstore.git
    cd rentalstore
    ```

2. **Configure the database:**
   Update `application.properties` with your database configuration.
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:8080/rentalstore
   spring.datasource.username=your_db_username
   spring.datasource.password=your_db_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

## API Endpoints

### Authentication

- **Login:**
  ``` http
  POST /api/auth/login
  ```
  
- **Request Body:**
    ``` json
    {
        "username": "user",
        "password": "password"
    }
    ```
- **Response:**
    ``` json
    {
        "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdXBlcmFkbWluIiwiaWF0IjoxNzE5MTUxMjkwLCJleHAiOjE3MTkxNTQ4OTB9.ojUZMWhOwydabuZc_VwzRNkI1zqQNpbcVVssxZIcuFw"
    }
    ```

### Reservation

- **Create Reservation Endpoint:**
  ``` http
  POST /api/reservations
  ```
  
- **Header Authorization:**
  ``` http
  Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdXBlcmFkbWluIiwiaWF0IjoxNzE5MTUxMjkwLCJleHAiOjE3MTkxNTQ4OTB9.ojUZMWhOwydabuZc_VwzRNkI1zqQNpbcVVssxZIcuFw"
  ```
  
- **Request Body:**
    ``` json
    {
      "type": "CLOTH",
      "data": {
        "customerId": "12345",
        "startDate": "2024-06-23",
        "endDate": "2024-06-23",
        "location": "Mogi das Cruzes, SP, Brazil",
        "additionalInfo": "Request for a wedding"
      }
    }
    ```
- **Response:**
    ``` json
    {
        "message": "Cloth reserved successfully!",
        "customerId": "12345",
        "startDate": "2024-06-23",
        "endDate": "2024-06-23",
        "location": "Mogi das Cruzes, SP, Brazil",
        "additionalInfo": "Request for a wedding"
    }
    ```
