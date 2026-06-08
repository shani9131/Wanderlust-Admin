# 🌍 Wanderlust Admin - Enterprise Travel CRM

> A decoupled, full-stack B2B Customer Relationship Management (CRM) portal designed for travel agencies to manage user bookings, optimize tour routes, and process asynchronous payments.

# Wanderlust Admin - Travel Management System ✈️

🌍 **Live Demo:** [wanderlust-admin.vercel.app](https://wanderlust-admin.vercel.app)

## 🚀 Overview
Wanderlust Admin is engineered keeping **Enterprise-Level System Architecture** in mind. Moving away from traditional monolithic desktop applications, this system utilizes a strict
separation of concerns with a RESTful Spring Boot backend and a lightweight Vanilla JavaScript frontend. It features real-time state management, secure database integration, and 
an open-source mapping ecosystem.

## ✨ Key Features
* **Decoupled Architecture:** 100% separation between the UI and Business Logic layers, communicating exclusively via REST APIs (JSON).
* **State Management (Booking Lifecycle):** Implements a realistic B2B booking flow. Reservations are initially held in a `Pending` state and dynamically transition to `Confirmed` only upon successful payment resolution.
* **Simulated Asynchronous Payment Gateway:** Features a mock payment checkout system demonstrating handling of asynchronous network delays and UI loader states.
* **Smart Route Optimizer:** Integrates **Leaflet.js** and **OpenStreetMap (OSM)** for a cost-effective, open-source alternative to proprietary mapping APIs, complete with smooth coordinate-based flight animations.
* **Relational Database Mapping:** Complex object-relational mapping (ORM) handling multiple entities (Accounts, Hotel Bookings, Package Bookings) using Spring Data JPA.

## 💻 Tech Stack
* **Frontend:** HTML5, CSS3, Vanilla JavaScript (Fetch API, DOM Manipulation)  (Deployed on **Vercel**)
* **Backend:** Java, Spring Boot, Docker (Deployed as a containerized Web Service on **Render**) ,Spring Web, RESTful Services
* **Database & ORM:** MySQL, Spring Data JPA, Hibernate, (Hosted securely on **Aiven Cloud**)
* **Third-Party Integrations:** Leaflet.js (Open-Source Maps)

## ⚙️ Local Setup & Installation

### 1. Database Configuration
1. Open MySQL Workbench and create a schema named `travelmanagementsystem`.
2. Update the `application.properties` file in `src/main/resources` with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/travelmanagementsystem
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update


2. Running the Backend (Spring Boot)
Ensure you have Java and Maven installed.

Bash
mvn spring-boot:run
The backend server will start on https://wanderlust-admin.onrender.com.

3. Running the Frontend
Navigate to the frontend/ directory.

Open index.html using Live Server in VS Code (or serve it on any local port like 5500).

The application communicates with the backend via configured CORS mapping.

📈 Future Enhancements
Integration of Spring Security with BCrypt password hashing.

Implementation of JWT (JSON Web Tokens) for stateless session management.

Migration of the simulated payment gateway to a live Stripe/Razorpay test environment.
