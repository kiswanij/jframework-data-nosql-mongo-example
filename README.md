# JFramework Microservice Client Example

_Last updated: Aug 20, 2025_


This repository contains a _JFramework-ServiceClient_ example which calls a backend microservice. 

## Prerequisites:
- JDK 17+ Installed
- [Simple Microservice Running](https://github.com/kiswanij/jkframework-microservice-example)

## Usage:
1. Clone the repository
2. Import as Java project into your favorite IDE (we use _SpringToolSuite_ and _Eclipse-JavaEE_)
3. Run `App` class.

## Project Main Contents 
The repository  contains the following main contents: 
1. Maven project with [pom.xml](pom.xml)
  > :page_facing_up:*Note*: If you are using Eclipse, be sure to refresh your project (select your project→ right click→ Maven→ Update Project)
2. [Config file](src/main/resources/config.properties) which contains the database config.
  >:page_facing: To change the database engine, enable the proper config in the config file.
3. [Person class](src/main/java/com/app/Person.java) which is contains the model fields.
4. [App class](src/main/java/com/app/App.java)  

