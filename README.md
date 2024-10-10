# Docker-Compose-with-PostgreSQL-and-SpringBoot

This project is a Spring Boot CRUD application for docker-compose testing with mongodb database.

## Features

- dockerization of application and postgreSQL
- image generation
- making an container with both PostgreSQL and application

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- docker
- docker compose

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```sh
   https://github.com/KoushalKumar22/Docker-Compose-with-PostgreSQL-and-SpringBoot.git
   cd Docker-Compose-with-PostgreSQL-and-SpringBoot
2. Build the application jar file first:
   ```sh
     mvn clean install
3. Run Docker Compose to build and start the containers
   ```sh
     docker-compose up --build
   
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: `/test`

- Method: GET

- Description: Test the API to ensure it's running

- Response: "This Is A Test Run"

2. Save DATA
- URL: `/save`
- Method: POST
- Description: Save a new customer data record to the database
- Request Body: json in postman
  ```sh
    {
    "name": "rohit",
    "age": 22,
    "address": "ranchi"
    }

3. Get All Users
- URL: `/all`
- Method: GET
- Description: Returns a list of all Customers profiles.
  
### Project Structure

- `Profile`: Entity class representing a Customer profile.
- `ProfileRepository`: Repository interface for CRUD operations on user profiles.
- `ProfileController`: REST controller for handling Customer-related requests.

## Acknowledgements

I would like to thank the following resources and individuals who made this project possible:

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate](http://hibernate.org/)
- [JetBrains](https://www.jetbrains.com/idea/)
- [Stack Overflow](https://stackoverflow.com/)
