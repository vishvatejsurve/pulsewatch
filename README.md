# 📊 PulseWatch - Real-Time Event Monitoring Platform (Spring Boot)

PulseWatch is a production-style backend application built using Spring Boot that enables real-time event monitoring, analytics, and dashboard insights. It helps track application events, monitor service performance, and visualize operational metrics.

---

## 🚀 Features

📌 Event Management (Create & Track Events)

📊 Dashboard Analytics

📈 Event Statistics by Type & Status

⚡ Redis Integration

🗄️ MySQL Database

🐳 Docker & Docker Compose Support

📑 Swagger API Documentation

⚠️ Global Exception Handling

✅ Request Validation

---

## 🧠 Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Redis
- Docker
- Docker Compose
- Swagger / OpenAPI
- Maven
- Lombok

---

## 📁 Project Structure

```text
controller/      → REST APIs

service/         → Business Logic

repository/      → Database Layer

entity/          → Database Models

dto/             → Request / Response Objects

mapper/          → DTO Mapping

config/          → Application Configurations

exception/       → Global Exception Handling

enums/           → Event Types & Status
```

---

## 📊 Dashboard Features

- Total Events
- Successful Events
- Failed Events
- Average Response Time
- Event Count by Type
- Event Count by Status
- Service-wise Event Statistics

---

## 📈 Event Workflow

```text
Application Event
        ↓
Receive Event Request
        ↓
Validate Request
        ↓
Store in MySQL
        ↓
Update Dashboard Analytics
        ↓
Return API Response
```

---

## 🚀 API Endpoints

### 📌 Event APIs

```http
POST /api/events

GET /api/events

GET /api/events/{id}

DELETE /api/events/{id}
```

---

### 📊 Dashboard APIs

```http
GET /api/dashboard/summary

GET /api/dashboard/event-types

GET /api/dashboard/status

GET /api/dashboard/services
```

---

## 🧪 Testing (Postman / Swagger)

1. Start Docker Containers

2. Run Spring Boot Application

3. Open Swagger UI

```
http://localhost:8080/swagger-ui/index.html
```

4. Create Events

5. View Dashboard Analytics

---

## 📝 Sample Event Request

```json
{
    "eventType": "LOGIN",
    "serviceName": "Auth-Service",
    "status": "SUCCESS",
    "responseTime": 120
}
```

---

## ⚙️ Setup Instructions

### Clone Repository

```bash
git clone https://github.com/your-username/pulsewatch.git
```

### Move into Project

```bash
cd pulsewatch
```

### Run Using Docker

```bash
docker compose up --build
```

Application

```
http://localhost:8080
```

Swagger

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🏆 Key Learnings

- Spring Boot REST API Development
- Spring Data JPA & Hibernate
- Docker & Docker Compose
- Redis Integration
- DTO & Entity Mapping
- Global Exception Handling
- Dashboard Analytics
- REST API Design
- API Documentation with Swagger

---

## 🚀 Future Improvements

🔐 Spring Security with JWT

👥 Role-Based Authentication

🌐 React Dashboard

⚡ WebSocket for Real-Time Updates

📨 Email Notifications

📈 Interactive Charts & Analytics

☁️ Cloud Deployment

🔄 CI/CD Pipeline

---

## 👨‍💻 Author

**Vishvatej Surve**

Backend Developer | Java | Spring Boot

---

⭐ If you like this project, give it a star!
