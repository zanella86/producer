# PRODUCER

---

## OVERVIEW

![Overview](docs/images/overview.PNG)

---

### GRUPO

- RM346315: Lais Kagawa
- RM346511: Jônatha Lacerda Gonzaga
- RM346958: Thiago de Souza Zanella
- <del> RM347277: Gustavo de Oliveira Freitas</del> (Desistiu do curso)

---

### REPOSITÓRIOS RELACIONADOS

- https://github.com/lakagawa/drone
- https://github.com/jhowlacerda/consumer

---

### FERRAMENTAS DE INTEGRAÇÃO

- Slack
- Github
- Trello
- RabbitMQ
- Draw.io

---

## PARA TESTAR

### Configure o ambiente

#### Versão do java
![JDK](docs/images/config_java.PNG)
![Gradle](docs/images/config_gradle01.PNG)

#### Execução com o spring boot/gradle
![Gradle/builder](docs/images/config_gradle02.PNG)


#### RabbitMQ 
![Criando uma instancia - Parte 1](docs/images/config_rabbitmq01.PNG)
![Criando uma instancia - Parte 2](docs/images/config_rabbitmq02.PNG)
![Criando uma instancia - Parte 3](docs/images/config_rabbitmq03.PNG)
![Criando uma instancia - Parte 4](docs/images/config_rabbitmq04.PNG)

##### Configure o endereço do broker

No arquivo [application.properties](src/main/resources/application.properties) preencha o valor do atributo 
`spring.rabbitmq.addresses`

#### Execute esta aplicação e escolha um dos métodos abaixo para executar o comando de teste:
  - Executar diretamente do prompt de comando;
  - Intellij: É necessário que o terminal da IDE esteja configurado para executar com o **cmd.exe**:
![Terminal](docs/images/config_terminal.PNG)


#### Execute o teste!
Caso tenha optado pela IDE Intellij, clique no símbolo verde ao lado esquerdo do comando abaixo:
```shell
curl -X POST http://localhost:8080/drone/report/status --header "Content-Type: application/json" -d "@src/test/resources/ReportStatusNormal.json"
```
```shell
curl -X POST http://localhost:8080/drone/report/status --header "Content-Type: application/json" -d "@src/test/resources/ReportStatusAlert.json"
```

Exemplo de conteúdo do teste:
```json
{
  "idDrone": "DRONE_NNN",
  "latitude": -14.739023157961602,
  "longitude": -75.13000484778613,
  "temperatura": 30,
  "umidade": 15
}
```

### Resultado esperado

#### Exchanges

![Broker-Queues](docs/images/amqp_default01.PNG)
![Broker-Queues](docs/images/amqp_default02.PNG)

#### Queues

![Broker-Queues](docs/images/queues_rabbitmq.PNG)
![Queue-Alert-01](docs/images/queue_alert_msg01.PNG)
![Queue-Alert-02](docs/images/queue_alert_msg02.PNG)
![Queue-Normal-01](docs/images/queue_normal_msg01.PNG)

--- 

#### REFERÊNCIAS

- [CloudAMQP - RabbitMQ](https://customer.cloudamqp.com/instance/)
- [Draw.io](https://app.diagrams.net)
