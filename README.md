# Selenium Automation :

__*Please Note : This is an on-going project*__

## Content

* **Apache Maven:** pom.xml maintenance
* **Java:** OOP Concepts usage
* **Selenium:** Selenium 4, WebDriverManager, Elements, xpath, PageFactory
* **Page Object Model:** Clear separation of tests and pages
* **TestNG:** Cross-browser testing, groups, hard assert vs. soft assert

## Prerequisites

### 1. Install java

1. [x] Download and install java
2. [x] Set up JAVA_HOME
    * Mac:
    * Windows:
3. [x] Verify Java set up

### 2. Install Apache Maven

1. [x] Download and install maven
2. [x] Set up MAVEN_HOME
    * Mac:
    * Windows:
3. [x] Verify Maven set up

### 3. Install IntelliJ IDEA

## Steps

### 1. Build the project

* Terminal: `mvn clean install -DskipTests`

### 2. Run a test

#### Prerequisites:
* Install Safari, Chrome and Firefox browsers 
* To run on safari; 
  * enable developer settings on safari browser 
  * run this cmd on terminal: `sudo safaridriver --enable`

#### Test Suites:
* Run smoke.xml (chrome only) : 
* Run regression.xml (chome & firefox) : 
* Run functional.xml (safari, chome & firefox) : `mvn test`

#### Checking reports:
* View emailable-report.html in target folder on browser 

  