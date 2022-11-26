# JKFramework Data NOSQL (Mongodb) Example
_Last updated: 2022-11-26_


This repository contains a _JKFramework-Data_ example which uses Mongodb dataaccess to persist and retrieve data from Mongodb instance.

## Prerequisites:
- JDK 17+ Installed
- [Mongodb Installed](https://framework.smart-api.com/tutorials/install-mongo-nosql-tutorial.html)

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
3. [Account class](src/main/java/com/app/Model.java) which is contains the model fields.
4. [App class](src/main/java/com/app/App.java)  

