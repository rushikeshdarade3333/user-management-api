
# User Management API

![Java](https://img.shields.io/badge/Java-17-orange.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.3-brightgreen.svg)
![Spring Web](https://img.shields.io/badge/Spring%20Web-3.1.3-brightgreen.svg)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-3.1.3-brightgreen.svg)
![MySQL Connector/J](https://img.shields.io/badge/MySQL%20Connector%2FJ-8.0.23-blue.svg)
![Lombok](https://img.shields.io/badge/Lombok-1.18.22-yellow.svg)
![Spring Boot Starter Validation](https://img.shields.io/badge/Spring%20Boot%20Starter%20Validation-3.1.3-brightgreen.svg)
![Spring Boot Starter Test](https://img.shields.io/badge/Spring%20Boot%20Starter%20Test-3.1.3-brightgreen.svg)

The User Management API is a Spring Boot-based web application designed for efficient management of user data. This API provides RESTful endpoints for creating, retrieving, updating, and deleting user information, making it a versatile solution for user-related operations in various applications.

Certainly! Here's a section for the developer/creator with badges for LinkedIn and Gmail:

---

## Developer

![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=for-the-badge&logo=linkedin&labelColor=0077B5)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=social&logo=linkedin&labelColor=0077B5)](https://www.linkedin.com/in/your-linkedin-profile)

![Gmail](https://img.shields.io/badge/Gmail-Contact-red?style=for-the-badge&logo=gmail&labelColor=D14836)
[![Gmail](https://img.shields.io/badge/Gmail-Contact-red?style=social&logo=gmail&labelColor=D14836)](mailto:your-email@gmail.com)

Feel free to replace "your-linkedin-profile" with your actual LinkedIn profile URL and "your-email@gmail.com" with your Gmail email address.
## Developer

Linkdin profile - ![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=for-the-badge&logo=linkedin&labelColor=0077B5)(www.linkedin.com/in/rushikesh-darade).

Email id        - ![Gmail](https://img.shields.io/badge/Gmail-Contact-red?style=for-the-badge&logo=gmail&labelColor=D14836)(mailto:rushikeshdarade3333@gmail.com).

## Features

- **Get All Users:**
  Retrieve a list of all users in the system.

- **Get User by ID:**
  Retrieve details of a specific user based on the provided user ID.

- **Create User:**
  Create a new user using the provided user data in the request body.

- **Update User by ID:**
  Update the details of an existing user based on the provided user ID and data in the request body.

- **Delete User by ID:**
  Delete a user with the specified user ID.

## Technologies Used

- **Java 17:**
  The programming language version used for development.

- **[Spring Boot 3.1.3](https://spring.io/projects/spring-boot):**
  The framework used for building and running the application.

- **[Spring Boot Starter Data JPA](https://spring.io/guides/gs/accessing-data-jpa/):**
  Starter for using Spring Data JPA for database access.

- **[Spring Boot Starter Web](https://spring.io/guides/gs/spring-boot/):**
  Starter for building web applications using Spring.

- **[Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.devtools):**
  Provides fast application restarts, among other development tools. It is included as a runtime dependency with optional scope.

- **[MySQL Connector/J](https://dev.mysql.com/doc/connector-j/en/):**
  The official MySQL JDBC driver for connecting to a MySQL database.

- **[Lombok](https://projectlombok.org/):**
  A library that simplifies Java code by providing annotations for common tasks like getters, setters, and constructors.

- **[Spring Boot Starter Validation](https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto-configure-validation):**
  Starter for using the Validation API to add validation rules to the application.

- **[Spring Boot Starter Test](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-testing):**
  Starter for testing Spring Boot applications with libraries like JUnit, TestNG, and Mockito.

## Usage

### API Endpoints

1. **Get All Users:**
   - **Endpoint:** `GET /users`
   - **Description:** Retrieves a list of all users in the system.

2. **Get User by ID:**
   - **Endpoint:** `GET /users/{id}`
   - **Description:** Retrieves details of a specific user based on the provided user ID.

3. **Create User:**
   - **Endpoint:** `POST /users`
   - **Description:** Creates a new user using the provided user data in the request body.
 Sample Request Body:
   ```json
   {
       "firstName": "John",
       "lastName": "Doe",
       "email": "john.doe@example.com",
       "phoneNumber": "1234567890",
       "age": 30,
       "address": "123 Main St"
   }
   ```

4. **Update User by ID:**
   - **Endpoint:** `PUT /users/{id}`
   - **Description:** Updates the details of an existing user based on the provided user ID and data in the request body.


5. **Delete User by ID:**
   - **Endpoint:** `DELETE /users/{id}`
   - **Description:** Deletes a user with the specified user ID.

## Testing

To test the API, you can use tools like Postman. Refer to the [API Endpoints](#api-endpoints) section for sample requests.

