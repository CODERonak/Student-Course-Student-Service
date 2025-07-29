# 🎓 Student-Service – Student Management Microservice

## ✅ Status: Completed

This microservice handles student profile information within a microservices-based **Student-Course Management System**.

---

## 🎯 Objective

Manages **student profiles** including name, email, and a unique user reference. It interacts with other services like `course-service` and `enrollment-service`.

---

## ✨ Features

- Create and list student profiles
- DTO-level input validation
- Feign/WebClient-based inter-service communication

---

## 🛠️ Tech Stack

- Spring Boot
- Spring Security + JWT
- Spring Data JPA + MySQL
- Java 17+, Lombok, MapStruct
- Feign / WebClient for service calls

---

## 📚 API Endpoints

| Method | Endpoint    | Description                  |
|--------|-------------|------------------------------|
| POST   | /students   | Create a new student profile |
| GET    | /students   | List all student profiles    |

---

## 🔗 Related Services

| Service | Description | Repository |
|--------|-------------|------------|
| 📘 [`course-service`](https://github.com/CODERonak/Student-Course-Course-Service) | Course CRUD | [GitHub](https://github.com/CODERonak/Student-Course-Course-Service) |
| 🔗 [`enrollment-service`](https://github.com/CODERonak/Student-Course-Enrollment-Service) | Manages enrollments | [GitHub](https://github.com/CODERonak/Student-Course-Enrollment-Service) |
| 🧭 [`eureka-server`](https://github.com/CODERonak/Student-Course-Eureka-Server) | Service discovery | [GitHub](https://github.com/CODERonak/Student-Course-Eureka-Server) |
