# Getting Started
Saltpay submission ankurbrdwj , No Web framework is used , Simple Java app build with maven

## Install and Run
Need to install [Java 18](https://www.oracle.com/java/technologies/downloads/) and [gradle 7.5](https://docs.gradle.org/current/userguide/installation.html) to run the app

## Execution
After you have installed java JDK and Gradle.

```shell
./gradlew build
```

To run the application you can run the following:

Build the jar file

```shell
./gradlew jar
```

Args:

- 1 = Required = size of the army

```shell
 java -jar build/libs/tdd-kata.jar <size>  ```

Example:

```shell
 java -jar build/libs/tdd-kata.jar 167
 ```

