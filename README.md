# Microservice based app piece - Service Discovery

#### Index

* [Gateway](https://github.com/PedrosUsername/gateway)
* [Service Discovery](https://github.com/PedrosUsername/service_discovery) <--(voce esta aqui)
* [Config Server](https://github.com/PedrosUsername/config_server)
* [Microservice 02](https://github.com/PedrosUsername/microservice_02)
* [Microservice 01](https://github.com/PedrosUsername/microservice_01)

## Service Discovery

O módulo service discovery de uma apliacação baseada em microserviços é o ferramental que permite que os
microserviços interajam uns com os outros de forma indireta, uma vez que interações diretas poderiam
acabar criando interdependências entre os microserviços. Algo inadmissível para a arquitetura.

## Esse projeto foi feito com Spring Boot:

Com o { [Config Server](https://github.com/PedrosUsername/config_server) } funcionando, inicie o projeto no seu sistema com o comando:

```shell script
$ ./gradlew bootRun
```

## O projeto foi desenvolvido e testado sob as seguintes condições:

* Java 8;
* Gradle 7.1.1;
* Elasticsearch 7.14.0;
* Docker 20.10.8
* Linux 5.4.0-81-generic amd64
* Intellj IDEA Community Edition;
* Controle de versão GIT;
* GitHub;
