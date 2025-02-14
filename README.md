# Real-time Notification Service

A real-time notification service built with Spring Boot and WebSocket. This service allows sending notifications to connected clients in real-time using WebSocket protocol.

## Technologies
- Java 18
- Spring Boot 2.7.3
- WebSocket
- Spring WebSocket
- Lombok
- Maven
- Docker

## Features
- Real-time notifications via WebSocket
- Support for multiple clients
- Notification broadcasting
- Connection handling
- Docker support

## Prerequisites
- Java 18 or higher
- Maven
- Docker

## Project Structure


## Getting Started

### Running the Application
1. Clone the repository
2. Navigate to the project directory
3. Run `mvn spring-boot:run`
4. The application will start on `http://localhost:8080`

### WebSocket Endpoint
The WebSocket endpoint is available at: `ws://localhost:8080/ws/notifications`

## Usage
Connect to the WebSocket endpoint to receive notifications in real-time.
