
# TestingProject_02_Selenium_TestNG_Actions

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Platform](https://img.shields.io/badge/Platform-JVM-blue?style=for-the-badge)
![TestNG](https://img.shields.io/badge/TestNG-FF7300?style=for-the-badge&logo=testng&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

## 🚀 Introduction
This project is designed to perform automated testing of the functionalities of the Demo Web Shop (http://demowebshop.tricentis.com/) using Java, Selenium, and TestNG. The primary focus of this project is on UI (User Interface) testing to ensure that the web application behaves as expected when users interact with it.

The project leverages the Selenium WebDriver for browser automation, enabling the simulation of user actions such as clicking, typing, and navigating through web pages. TestNG is used as the testing framework to organize and execute the tests, providing detailed reports and the ability to run tests in parallel.

Key aspects of this project include:
- **User Registration Testing**: Verifying the registration process, including both positive and negative test cases.
- **User Login Testing**: Ensuring that the login functionality works correctly with valid and invalid credentials.
- **Product Ordering Testing**: Automating the process of adding products to the cart and completing an order.
- **Negative Testing**: Checking the application's response to invalid input and unexpected user behavior.

By automating these test scenarios, the project aims to improve the reliability and efficiency of testing processes, reduce manual effort, and ensure the overall quality of the web application.

## 📋 Table of Contents
- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Dependencies](#dependencies)
- [Documentation](#documentation)
- [Examples](#examples)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [Contact](#contact)
- [Contributors](#contributors)
- [License](#license)

## 📂 Project Structure
```
TestingProject_02_Selenium_TestNG_Actions
├── .idea
├── src
│   └── test
│       └── java
│           └── TestingProject_02
│               ├── TestingProject_02
│               └── utility
│                   ├── BaseDriver
│                   └── MyFunction
├── target
├── .gitignore
├── LICENSE
├── pom.xml
└── README.md
```

## 🛠️ Installation
To install and set up the project using IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select `File > New > Project from Version Control`.
3. In the URL field, enter the repository URL:
   \`\`\`sh
   https://github.com/ChatGTHB/TestingProject_02_Selenium_TestNG_Actions
   \`\`\`
4. Click `Clone`.
5. IntelliJ will automatically detect the `pom.xml` file and import the Maven project.
6. Ensure that all Maven dependencies are downloaded. You can check this in the `Maven` tool window in IntelliJ.

## 🚀 Usage
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

For detailed test case steps, refer to the [Test Cases Documentation](./src/test/java/TestingProject_02/TestingProject_02.java).

## ✨ Features
- Registration functionality testing.
- Login functionality testing.
- Product order functionality testing.
- Negative test cases for registration and login.

## 📦 Dependencies
The project uses the following dependencies:

- **Java 11**: The programming language used for developing the tests.
- **Selenium 4.11.0**: A framework for browser automation.
- **TestNG 7.7.0**: A testing framework inspired by JUnit and NUnit.
- **JavaFaker 1.0.2**: A library for generating random test data.
- **SLF4J 1.7.32**: A simple logging facade for Java.
- **Commons IO 2.11.0**: A library of utilities to assist with IO operations.

Dependencies are managed via the `pom.xml` file.

### Note
Ensure that you are using the specified versions or higher for all dependencies to avoid compatibility issues.

## 📚 Documentation
Detailed documentation can be found in the following resources:
- [Java Documentation](https://docs.oracle.com/en/java/)
- [Selenium Documentation](https://www.selenium.dev/documentation/)
- [TestNG Documentation](https://testng.org/doc/)

## 📂 Examples
Refer to the following key classes and test cases for implementation details:

- `utility.BaseDriver`: Initializes the WebDriver and manages browser settings.
- `TestingProject_02.TestingProject_02`: Contains the test cases for the project.

For more details, refer to the source code files in the `src/test/java` directory.

## 🐛 Troubleshooting
If you encounter any issues:
- Ensure all dependencies are correctly installed.
- Verify that the correct versions of Java, Selenium, and TestNG are being used.
- Check the console output for detailed error messages.

## 🤝 Contributing
Contributions are welcome! Please fork this repository and submit a pull request for any improvements or bug fixes.

## 📞 Contact
For any questions or suggestions, please open an issue or contact the repository owner.

## 👥 Contributors
- [ChatGTHB](https://github.com/ChatGTHB)

## 📄 License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
