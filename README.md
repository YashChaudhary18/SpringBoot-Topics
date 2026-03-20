# SpringBoot-Topics

# Spring Boot Learning Project 

This project covers the fundamental concepts of Spring Boot required to build a RESTful API. It focuses on understanding how data flows between client and server using request handling, response handling, and DTOs.

---

##  Learning Topics Covered

### 1. Simple REST API
- Introduction to REST architecture
- Creating basic endpoints using:
  - `@RestController`
  - `@GetMapping`
  - `@PostMapping`
- Understanding URL mapping and HTTP methods

---

### 2. Request Handling
- Handling incoming client data
- Using:
  - `@RequestParam` (for query parameters)
  - `@PathVariable` (for URL values)
  - `@RequestBody` (for JSON data)
- Example:
  - Receiving user input from API request

---

### 3. Response Handling
- Sending data back to the client
- Returning:
  - Simple strings
  - JSON objects
  - Custom responses
- Using:
  - `ResponseEntity` for better control (status, headers)

---

### 4. DTO (Data Transfer Object)
- Separating internal data from API response
- Why DTO is important:
  - Security (hide sensitive data)
  - Clean architecture
- Creating DTO classes
- Mapping Entity → DTO

---

##  Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven

---

##  Project Structure

src/main/java/

├── RestApi/
│   ├── Api.java
│   └── RestApiApplication.java

├── journalApp/
│   ├── controller/
│   │   ├── HealthCheck.java
│   │   └── journalEntryController.java
│   │
│   ├── entity/
│   │   ├── JournalEntry.java
│   │   └── JournalApplication.java
│
└── README.md
