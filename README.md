
# ![Project Logo](https://img.icons8.com/ios-filled/50/000000/test-tube.png) TestingProject_02_Selenium_TestNG_Actions

## ![Introduction](https://img.icons8.com/ios-filled/24/000000/info.png) Introduction
This project is designed to test the functionalities of the Demo Web Shop (http://demowebshop.tricentis.com/) using Java, Selenium, and TestNG. The project involves the use of the Action class for simulating user interactions with the web application.

## ![Table of Contents](https://img.icons8.com/ios-filled/24/000000/list.png) Table of Contents
- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Dependencies](#dependencies)
- [Documentation](#documentation)
- [Examples](#examples)
- [Troubleshooting](#troubleshooting)
- [Contributors](#contributors)
- [License](#license)

## ![Installation](https://img.icons8.com/ios-filled/24/000000/download.png) Installation
To install and set up the project using IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select `File > New > Project from Version Control`.
3. In the URL field, enter the repository URL:
    ```sh
    https://github.com/ChatGTHB/TestingProject_02_Selenium_TestNG_Actions
    ```
4. Click `Clone`.
5. IntelliJ will automatically detect the `pom.xml` file and import the Maven project.
6. Ensure that all Maven dependencies are downloaded. You can check this in the `Maven` tool window in IntelliJ.

## ![Usage](https://img.icons8.com/ios-filled/24/000000/play.png) Usage
To run the tests using IntelliJ IDEA:

1. Open the project in IntelliJ IDEA.
2. Navigate to the `src/test/java` directory.
3. Right-click on the test class or method you want to run (e.g., `TestingProject_02`).
4. Select `Run 'TestingProject_02'` or `Run 'methodName'`.

### Test Scenarios
The project includes the following test scenarios:

- **Registration Test**: Tests user registration functionality.
- **Negative Registration Test**: Tests registration with an already registered email.
- **Login Test**: Tests user login functionality.
- **Negative Login Test**: Tests login with invalid credentials.
- **Order Test**: Tests the process of adding a product to the cart and completing an order.

For detailed test case steps, refer to the [Test Cases Documentation](./src/test/java/TestingProject_02/TestingProject_02).
## ![Features](https://img.icons8.com/ios-filled/24/000000/star.png) Features
- Registration functionality testing.
- Login functionality testing.
- Product order functionality testing.
- Negative test cases for registration and login.

## ![Dependencies](https://img.icons8.com/ios-filled/24/000000/dependency.png) Dependencies
The project uses the following dependencies:

- ![Java](https://img.shields.io/badge/Java-11-blue?logo=java) **Java 11**: The programming language used for developing the tests.
- ![Selenium](https://img.shields.io/badge/Selenium-4.11.0-green?logo=selenium) **Selenium 4.11.0**: A framework for browser automation.
- ![TestNG](https://img.shields.io/badge/TestNG-7.7.0-brightgreen?logo=testng) **TestNG 7.7.0**: A testing framework inspired by JUnit and NUnit.
- ![JavaFaker](https://img.shields.io/badge/JavaFaker-1.0.2-yellow?logo=java) **JavaFaker 1.0.2**: A library for generating random test data.
- ![SLF4J](https://img.shields.io/badge/SLF4J-1.7.32-orange?logo=slf4j) **SLF4J 1.7.32**: A simple logging facade for Java.
- ![Commons IO](https://img.shields.io/badge/Commons%20IO-2.11.0-lightgrey?logo=apache) **Commons IO 2.11.0**: A library of utilities to assist with IO operations.

Dependencies are managed via the `pom.xml` file.

## ![Documentation](https://img.icons8.com/ios-filled/24/000000/book.png) Documentation
Detailed documentation can be found in the [TestNG Documentation](https://testng.org/doc/).

## ![Examples](https://img.icons8.com/ios-filled/24/000000/code-file.png) Examples
Refer to the following key classes and test cases for implementation details:

- `utility.BaseDriver`: Initializes the WebDriver and manages browser settings.
- `TestingProject_02.TestingProject_02`: Contains the test cases for the project.

For more details, refer to the source code files in the `src/test/java` directory.

## ![Troubleshooting](https://img.icons8.com/ios-filled/24/000000/bug.png) Troubleshooting
If you encounter any issues:
- Ensure all dependencies are correctly installed.
- Verify that the correct versions of Java, Selenium, and TestNG are being used.
- Check the console output for detailed error messages.

## ![Contributors](https://img.icons8.com/ios-filled/24/000000/conference-call.png) Contributors
- [ChatGTHB](https://github.com/ChatGTHB)

## ![License](https://img.icons8.com/ios-filled/24/000000/license.png) License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
