# Lab5-Rent-An-Apartment

## Project Synopsis
The `Lab5-Rent-An-Apartment` project is a Java-based application designed to help manage tenant information and rent schedules in an apartment building. The project includes functionality for calculating rent based on the floor number, formatting tenant names, and leveraging utility methods for string manipulation. It aims to demonstrate object-oriented programming principles such as encapsulation, aggregation, and method overriding.

### Key Features
- Manage tenant details, including name and floor number.
- Automatically format tenant names to ensure proper capitalization.
- Calculate and display rent amounts based on the floor number.
- Utility methods for string manipulation, such as capitalizing the first letter of a string.
- A test class to verify the functionality of the project.

---

## Ideal File and Directory Structure

Below is the recommended file and directory structure for the project:

```
Lab5-Rent-An-Apartment/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── company/
│   │   │           └── apartmentmanagement/
│   │   │               ├── Rent.java
│   │   │               ├── Tenant.java
│   │   │               ├── StringUtility.java
│   │   │               └── App.java
│   │   └── resources/
│   │       └── application.properties
│   ├── test/
│       ├── java/
│       │   └── com/
│       │       └── company/
│       │           └── apartmentmanagement/
│       │               └── RentTest.java
│       └── resources/
├── pom.xml
├── README.md
└── .gitignore
```

---

### File/Directory Descriptions

1. **`src/main/java/com/company/apartmentmanagement/`**  
   - Contains the main source code for the project:
     - `Rent.java`: Manages rent schedules and tenant aggregation.
     - `Tenant.java`: Represents a tenant with attributes like name and floor number.
     - `StringUtility.java`: Provides utility methods for string manipulation.
     - `App.java`: The main entry point for the application (optional, depending on project design).

2. **`src/main/resources/`**  
   - Stores configuration files or resources needed by the application.
   - Example: `application.properties` (if configuration is required).

3. **`src/test/java/com/company/apartmentmanagement/`**  
   - Contains unit tests for the project:
     - `RentTest.java`: Tests the functionality of the `Rent`, `Tenant`, and `StringUtility` classes.

4. **`pom.xml`**  
   - The Maven configuration file that manages dependencies and build instructions.

5. **`README.md`**  
   - Provides an overview of the project, including its purpose, features, and setup instructions.

6. **`.gitignore`**  
   - Specifies files and directories to be ignored by Git (e.g., `target/`, `.idea/`, etc.).

---

## How to Run the Project

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd Lab5-Rent-An-Apartment
   ```

2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

3. Run the application (if `App.java` is implemented):
   ```bash
   mvn exec:java -Dexec.mainClass="com.company.apartmentmanagement.App"
   ```

4. Run the tests:
   ```bash
   mvn test
   ```
