# microservice
This Spring Boot demo project is using Apache camel to put data in an Active MQ in every 10 seconds and prints the log messages on console.
We are also representing here how Apcahe camel help us to integrate differnet components very easily.

Below is the Docker command to start a docker instance of Active MQ:

docker run -p 61616:61616 -p 8161:8161 rmohr/activemq

Below is the ActiveMQ WebConsole Url:

http://0.0.0.0:8161/
