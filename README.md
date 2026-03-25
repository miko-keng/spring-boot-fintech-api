# Fintech Lead Scoring API (Spring Boot)

A robust backend service designed to process and validate credit leads using a tiered enterprise architecture. 

## 🛠 Tech Stack
* **Java 17** & **Spring Boot 3**
* **Spring Data JPA** (ORM for Database persistence)
* **H2 In-Memory Database** (Rapid development/testing)
* **Spring Security** (Custom filter chain for API access)
* **Jakarta Validation** (Constraint enforcement)
* **Lombok** (Boilerplate reduction)

## 🏗 Architecture
The project follows the **Controller-Service-Repository** pattern:
1. **Controller:** Handles REST requests and triggers `@Valid` constraints.
2. **Service:** Contains business logic for credit scoring (Approved/Rejected).
3. **Repository:** Manages data persistence via Hibernate.

## 🚀 How to Run & Test
1. Start the server: `./mvnw spring-boot:run`
2. Test Validation (Bad Request):
   ```bash
   curl -i -X POST http://localhost:8080/api/leads -H "Content-Type: application/json" -d '{"name": "", "creditScore": 999}'
