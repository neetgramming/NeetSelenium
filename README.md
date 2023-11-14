# Selenium Automation

__*Please Note : This is an on-going project*__

## Content

* **Apache Maven:** pom.xml maintenance
* **Java:** OOP Concepts usage
* **Selenium:** Selenium 4, WebDriverManager, Elements, xpath, PageFactory
* **Page Object Model:** Clear separation of tests and pages
* **TestNG:** Cross-browser testing, groups, hard assert vs. soft assert, reports generation

## Prerequisites

### 1. Install latest java version

1. [x] https://www.oracle.com/java/technologies/downloads/

### 2. Install Apache Maven

1. [x] https://maven.apache.org/install.html

### 3. Install IntelliJ IDEA

1. [X] https://www.jetbrains.com/idea/download/?section=mac

### 4. Install at least one of the browsers: Safari, Chrome and Firefox

## Steps

### 1. Build the project

* Run on terminal: `mvn clean install -DskipTests`

### 2. Run tests

#### Prerequisites:
* To run on safari; 
  * enable developer settings on safari browser 
  * run this command on terminal: `sudo safaridriver --enable`

#### Run Test Suites:
* Run smoke.xml (chrome only) on terminal: `mvn test -DsuiteXmlFile=smoke.xml`
* Run regression.xml (chome & firefox) on terminal : `mvn test -DsuiteXmlFile=regression.xml`
* Run functional.xml (safari, chome & firefox) on terminal : `mvn test -DsuiteXmlFile=functional.xml`

#### View TestNG Reports:
* Open emailable-report.html in surefire-reports in target folder on browser 

  