# Sample Selenium Gradle Project

## Purpose

Question:
What was the reason to create this project?

Answer:
* This project was created to setup a simple Selenium example.
* The project uses a very simple Page Object with a Web Driver configuration.
* The Web Driver configuration may be used to change the driver implementation without much code change anywhere else.
* There is also a single JUnit test that can be executed with 'gradle test'.
* The test itself opens a web page and asserts on the page title.
* WebDriverConfig will try to detect the OS and use the relevant chromedriver file to run the test

## Instructions on running from the command line

Navigate into the root directory of the project and run

```
./gradlew clean test
```