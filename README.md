# CustomNetflix - Spring Boot Application

A basic Spring Boot web application.

## Project Structure

```
.
├── src/
│   ├── main/
│   │   ├── java/com/example/customnetflix/
│   │   │   ├── CustomNetflixApplication.java (Main Spring Boot application)
│   │   │   └── controller/
│   │   │       └── HelloController.java (REST Controller)
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/example/customnetflix/
│           └── CustomNetflixApplicationTests.java
├── pom.xml (Maven configuration)
└── README.md
```

## Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher

## Building the Application

```bash
mvn clean install
```

## Running the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

- `GET /` - Welcome message
- `GET /api/health` - Health check endpoint

## Technologies Used

- Spring Boot 3.1.0
- Spring Web
- Maven
- Java 17

## Development

### IDE Setup

For VS Code, install the Extension Pack for Java:
- Extension Pack for Java (Microsoft)

For IntelliJ IDEA or Eclipse, Maven projects are automatically detected.

## License

MIT