# Hybrid Test Automation Framework

This project is a **Hybrid Test Automation Framework** combining **UI testing and API testing**.

## Technologies Used

* Java
* Selenium WebDriver
* RestAssured
* TestNG
* Maven

## Framework Structure

```
src
 ├── api        → API test classes
 ├── base       → Base test setup
 ├── pages      → Page Object Model classes
 ├── tests      → Test cases
 └── utils      → Utility classes
```

## Features

* UI Automation with Selenium
* API Automation with RestAssured
* Page Object Model design pattern
* ConfigReader for environment configuration
* Hybrid API + UI test scenario

## Example Test Flow

1. Create user via API
2. Open UI
3. Perform login
4. Validate secure page

## Run Tests

```bash
mvn clean test
```
