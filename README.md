# SportsTimeTracker

SportsTimeTracker is a Java application that allows users to log and track the time spent on various sports activities. It provides functionalities to log activities, view logged activities, and calculate the total time spent on all activities.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Running Tests](#running-tests)
- [Building Docker Image](#building-docker-image)
- [Jenkins Pipeline](#jenkins-pipeline)
- [Contributing](#contributing)
- [License](#license)

## Features

- Log sports activities with their duration.
- View all logged activities.
- Calculate the total time spent on all activities.

## Installation

1. Clone the repository:
    ```sh
    git clone git@github.com:MahnoorFatima02/SportsTimeTracker.git
    cd SportsTimeTracker
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

## Usage

To run the application, use the following command:
```sh
java -jar target/SportsTimeTracker.jar

## Running Tests
To run the tests, use the following command:
```sh
mvn test
```

## Building Docker Image
1. Build the Docker image:
    ```sh
    docker build -t sportstimetracker .
    ```
2. Run the Docker container:
    ```sh
    docker run -it --rm sportstimetracker:latest
    ```

## Jenkins Pipeline
The Jenkins pipeline is defined in the `Jenkinsfile`. It consists of the following stages:
1. Checkout: Clones the repository.
2. Build: Builds the project using Maven.
3. Test: Runs the tests using Maven.
4. Code Coverage: Generates the code coverage report using JaCoCo.
5. Publish Test Results: Publishes the test results.
6. Publish Coverage Report: Publishes the code coverage report.
7. Build Docker Image: Builds the Docker image.
8. Push Docker Image to Docker Hub: Pushes the Docker image to Docker Hub.

