# **ProjectVerse**

## About ProjectVerse

**ProjectVerse** is a tool built to make your projects easier and smarter. It helps you generate project-specific images, handles errors effectively, and includes a chatbot for real-time assistance. It's designed using **Spring Boot** for the backend and **React** for the frontend, bringing together AI and clean UI to streamline your project workflows.

### Features
1. **AI-Powered Image Generation**: Get tailored images for your projects based on keywords or themes.
2. **Error Handling**: Find, log, and fix issues quickly with detailed error insights.
3. **Chatbot Support**: Get real-time help for project queries, resource suggestions, and more.

---

## Getting Started

### Prerequisites
Before running the project, make sure you have:
- **Java 17+**
- **Node.js (16+)**
- **PostgreSQL** (or another database)
- **Maven** (to manage Spring Boot dependencies)

---

## Installation

### Backend Setup (Spring Boot)
1. Go to the backend folder:
   ```bash
   cd backend
   ```
2. Update the database details in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/projectverse
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Run the backend:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

---

### Frontend Setup (React)
1. Navigate to the frontend folder:
   ```bash
   cd ../frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the React development server:
   ```bash
   npm start
   ```

---

## Usage
1. Open your browser and navigate to `http://localhost:3000` for the frontend.
2. Interact with the chatbot, generate project images, or debug errors.
3. Backend runs at `http://localhost:8080`.

---
