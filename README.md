# OrangeHRM Test Automation Framework

A comprehensive Selenium-based test automation framework for OrangeHRM employee management system using BDD approach with Cucumber and Java.

## Overview

This project automates end-to-end testing of the OrangeHRM application, covering employee lifecycle management including employee creation, personal details, contact information, job assignments, salary management, qualifications, and advanced filtering operations.

## Technologies Used

- **Java** - Programming language
- **Selenium WebDriver 4.18** - Browser automation
- **Cucumber 7.15** - BDD framework with Gherkin syntax
- **TestNG 7.9** - Test execution framework
- **Maven** - Build and dependency management
- **Page Object Model (POM)** - Design pattern for maintainable test code
- **WebDriverManager** - Automatic browser driver management
- **Log4j** - Logging framework
- **ExtentReports** - HTML test reporting with screenshots

## Project Structure

```
src/
├── main/java/com/
│   ├── Baseclass/          # Base configuration and WebDriver setup
│   ├── Hooks/              # Cucumber hooks for setup/teardown
│   └── ReusableFunctions/  # Selenium wrapper methods
└── test/
    ├── java/com/
    │   ├── Pages/          # Page Object Model classes (16 pages)
    │   ├── StepDefinitions/# Cucumber step definitions
    │   └── TestRunner/     # Test execution runner
    └── resources/
        ├── Features/       # Cucumber feature files (BDD scenarios)
        ├── Properties/     # Configuration files
        └── Screenshot/     # Test execution screenshots
```

## Key Features

- **BDD Approach**: Gherkin-based feature files for readable test scenarios
- **Page Object Model**: 16+ page classes for modular and maintainable code
- **Cross-Browser Support**: Chrome and Firefox browser compatibility
- **Reusable Components**: Custom Selenium wrapper methods for common actions
- **Comprehensive Logging**: Log4j integration for debugging
- **Rich Reporting**: ExtentReports with screenshot capture
- **Property-Based Configuration**: Externalized test data and settings

## Test Coverage

The framework covers the following OrangeHRM modules:

- Employee Management (Add/Edit/Filter)
- Personal Details
- Contact Details
- Emergency Contacts
- Dependents
- Immigration
- Job Details
- Salary Management
- Report-to Relationships
- Qualifications (Work Experience, Education, Skills, Languages, Licenses)
- Memberships
- Advanced Filtering (7+ search criteria)

## Prerequisites

- Java JDK 8 or higher
- Maven 3.6+
- Chrome or Firefox browser

## Setup & Execution

1. Clone the repository
2. Update `src/test/resources/Properties/Config.Property` with your OrangeHRM URL and credentials
3. Run tests using Maven:
   ```bash
   mvn clean test
   ```

## Test Reports

- ExtentReports HTML reports are generated after test execution
- Screenshots are captured and stored in `src/test/resources/Screenshot/`
- Logs are available in `application.log`

## Author

Developed as part of test automation practice for enterprise HR management systems.
