# Spring Demo Application
This application is just used to understad basic usage of spring to create a restful api.

# Steps to run the application
1) Clone the repository git clone git@github.com:bpatel27/spring-demo-application.git
2) Run `./gradlew clean bootRun` (Here clean is optional)
3) Application will run on localhost:8080
4) Create a new user

     ```bash
     curl --location --request POST 'localhost:8080/users' \
    --header 'Content-Type: application/json' \
    --data-raw '{
      "firstName": "Bhavesh",
      "lastName": "Patel",
      "password": "secret"
    }'
     ```
     
 5) Get all users

     ```bash
     curl --location --request GET 'localhost:8080/users'
     ```
     
          
 6) Get a user based on its ID.

     ```bash
     curl --location --request GET 'localhost:8080/users/1'
     ```
