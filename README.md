---

# 🎓 Student-Service – Student Management Microservice

---

## 🚧 Status: In Development

> ⚠️ **This microservice is currently under active development.**
> Some features may be incomplete, unstable, or subject to change.
> It's a simple microservice project.
> Purpose is to understand the fundamentals or basics of microservices.

---

## 🎯 Objective

This service manages **student profile information** as part of a **Student-Course Management System** powered by Spring Boot and a microservices architecture. It communicates with other services like `enrollment-service` and `course-service`.

---

## ✨ Features

* **Student Profile Management:** Create, update, and retrieve student information (name, email, userId reference).
* **Inter-Service Compatibility:** Integrates with other microservices using REST or Feign clients.
* **Data Validation:** DTO-level input validations for clean and consistent data.

---

## 🛠️ Technologies Used

* **Spring Boot** – Java microservice framework
* **Spring Security** – Role-based and JWT-secured authentication
* **Spring Data JPA** – Simplified data persistence
* **MySQL** – Relational database
* **Java 17+** – Modern Java features and performance
* **Lombok** – Boilerplate reduction for models
* **MapStruct** – DTO ↔ Entity mappers
* **Feign/WebClient** – For inter-service communication

---

## 📦 Project Structure

```
student-service/
├── controller/StudentController.java     # API endpoints
├── dto/                                  # DTOs for request/response
├── model/                                # JPA entities
├── repository/                           # DB access layer
├── service/                              # Business logic
├── application.properties                # Configuration
└── pom.xml                               # Maven dependencies
```

---

## 📚 API Endpoints

| Method | Endpoint    | Description                  |
| ------ | ----------- | ---------------------------- |
| `POST` | `/students` | Create a new student profile |
| `GET`  | `/students` | List all student profiles    |

---

## 🌐 API Integration

This service communicates with:

* 🔗 \[`enrollment-service`]\(coming soon): Validates student data for enrollments

---

## 🔗 Related Microservices

| Service                                                                           | Description                             | Repository                                                           |
| --------------------------------------------------------------------------------- | --------------------------------------- | -------------------------------------------------------------------- |
| 🎓 `student-service`                                                              | *You are here*                          | –                                                                    |
| 📘 [`course-service`](https://github.com/CODERonak/Student-Course-Course-Service) | Course management and CRUD              | [GitHub](https://github.com/CODERonak/Student-Course-Course-Service) |
| 🔗 \[`enrollment-service`]\(coming soon)                                          | Student-course enrollment relationships | –                                                                    |

---

## 🧩 Database

Each microservice uses its **own database**.
This service connects to **MySQL** with its own schema (or instance) for isolation and modularity.

---