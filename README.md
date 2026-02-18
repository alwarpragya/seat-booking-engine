# seat-booking-engine
# High-Concurrency Multi-Vendor Seat Booking Engine
A production-grade reservation system built with **Spring Boot** and **PostgreSQL**.

## Key Features
* **Optimistic Locking:** Uses `@Version` to handle 1,000+ concurrent booking requests without data corruption.
* **Database Optimization:** Normalized schema designed for multi-vendor scaling.
* **RESTful API:** Clean, stateless endpoints for seat management and booking.

## Tech Stack
* **Backend:** Java 17, Spring Boot 3.x, Hibernate
* **Database:** PostgreSQL
* **Tools:** Maven, Git

## How to Run
1. Create a PostgreSQL database named `booking_db`.
2. Update `src/main/resources/application.properties` with your credentials.
3. Run `./mvnw spring-boot:run`
