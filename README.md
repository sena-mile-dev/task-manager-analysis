# Java Task Manager Codebase Analysis

This repository contains my AI-assisted analysis of a Java-based Task Manager application. The project simulates a real-world scenario where a developer must quickly understand an unfamiliar codebase to contribute effectively.

## 🧠 Project Goals

- Understand the project structure and architecture of a Java Spring Boot codebase
- Locate where features are implemented (e.g., export functionality)
- Analyze the domain model (Task, TaskStatus, TaskPriority)
- Plan the implementation of a new business rule

## 📄 Summary Document

See [`TaskManager_AI_Summary.docx`](./TaskManager_AI_Summary.docx) for the full analysis write-up, including:
- Initial and final understanding of the codebase
- Insights from AI prompt use
- Implementation strategy for the "overdue task" business rule
- Strategies for approaching future unfamiliar codebases

## 📌 Key Technologies

- Java 17+
- Spring Boot (REST API)
- Maven (`pom.xml` for dependency management)
- JPA (Java Persistence API)
- AI prompt engineering (code exploration support)

## 🚀 Skills Demonstrated

- Reverse engineering Java application structure
- Applying layered architecture (Controller-Service-Repository)
- Domain model interpretation and business rule planning
- Using AI to accelerate developer onboarding and code comprehension

## 🗃 Repository Structure

```
task-manager-analysis/
├── README.md
├── TaskManager_AI_Summary.docx
└── task_export_snippet.java
```

## 📌 Feature Highlight

Planned Feature: **Export Tasks to CSV**
- Method: `exportTasksToCSV()` in `TaskService`
- Endpoint: `GET /tasks/export` in `TaskController`
- Response: Downloadable CSV file of all tasks

## 🔖 Tags
`#Java` `#SpringBoot` `#AI-Prompts` `#CodeReview` `#StudentProject`

---

© 2025 Senamile Rethabile Aphane | University of Mpumalanga
