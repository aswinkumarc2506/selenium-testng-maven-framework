📌 Selenium Login Automation Framework (Java + Maven + TestNG)
This is a real-time automation testing project built using Java, Selenium WebDriver, TestNG, and Maven, designed to test the login functionality of the SauceDemo website. The framework is structured using the Page Object Model (POM) design pattern to promote clean code and reusability.

🔍 Project Objectives
Automate login functionality to save manual testing time.

Apply industry-standard tools and practices for UI automation.

Demonstrate modular and scalable test automation using POM.

Integrate TestNG for managing and executing test cases.

Use Maven for dependency management and automated test runs.

⚙️ Features
✅ Selenium WebDriver for browser automation

✅ TestNG for test structure and reporting

✅ Page Object Model (POM) design

✅ Maven for build and dependency management

✅ Surefire plugin for running tests and generating reports

✅ Scalable folder structure for growing test suites

📁 Project Structure
pgsql
Copy
Edit
EcommerceAutomation/
│
├── pom.xml                 --> Maven dependencies (Selenium, TestNG)
├── testng.xml              --> TestNG suite file
├── drivers/                --> Place your chromedriver.exe here
└── src/
    └── test/
        ├── java/
        │   ├── pages/
        │   │   └── LoginPage.java     # Page Object for login UI elements
        │   └── tests/
        │       └── LoginTest.java     # TestNG test case for login
🧪 How the Test Works
The test opens Chrome and navigates to https://www.saucedemo.com.

It enters the username (standard_user) and password (secret_sauce).

It clicks the login button.

It verifies if the page navigated to /inventory indicating login success.

Test result is displayed in the console and saved in target/surefire-reports.

🚀 How to Run
Clone the repo:

bash
Copy
Edit
git clone https://github.com/aswinkumarc2506/selenium-testng-maven-framework/tree/main

Download ChromeDriver matching your Chrome version:
👉 https://chromedriver.chromium.org/downloads

Place chromedriver.exe inside the drivers/ folder.

Run test using Maven:

bash
Copy
Edit
mvn test
✅ Sample Console Output
markdown
Copy
Edit
Opened browser
Navigating to URL...
Page title: Swag Labs
Login Test Executed Successfully!

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running tests.LoginTest
Total tests run: 1, Failures: 0, Skips: 0

[INFO] BUILD SUCCESS
🧠 Tech Stack
Java 17+

Selenium WebDriver 4.18.1

TestNG 7.8.0

Maven

ChromeDriver

Eclipse / IntelliJ IDE


