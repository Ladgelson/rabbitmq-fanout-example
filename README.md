# rabbitmq-fanout-example
A simple use of RabbitMQ using fanout exchange and two queues.

## Description
This is a simple project using Java, Spring Boot, RabbitMQ and Docker.
The main ideia is simply create a container running RabbitMQ. So, it was created one exchange and two queues via code.
This queues are binded to a fanout exchange, as the image below shows:
![diagram drawio (3)](https://user-images.githubusercontent.com/45443883/175384215-439397ef-cf88-4806-a0ac-fe9b12895dae.png)

## How to Install and Run the Project
#### 1 - Run the docker container
```javascript
docker-compose up
```
You can also see [here](http://localhost:15672/#/) the RabbitMQ Management, with user as `guest` and password as `guest`.
#### 2 - Run the Spring application in the `dev` profile, to listen the queue `teste`
#### 3 - Run the Spring application in the `hml` profile, to listen the queue `teste2`

## Doing a simple test
#### 1 - Open RabbitMQ Management
#### 2 - Send some messages as shown below
![Recording 2022-06-23 at 15 55 10](https://user-images.githubusercontent.com/45443883/175387424-712be272-da92-44ac-9e56-6a783058c425.gif)

Thanks,

Feel free to ask questions.
