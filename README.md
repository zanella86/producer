# PRODUCER

---

## OVERVIEW

![Overview](docs/images/overview.png)

---

### GRUPO

- RM346315: Lais Kagawa
- RM346511: Jônatha Lacerda Gonzaga
- RM346958: Thiago de Souza Zanella
- <del> RM347277: Gustavo de Oliveira Freitas</del> (Desistiu do curso)

---

### REPOSITÓRIOS RELACIONADOS

- https://github.com/lakagawa/drone

---

### FERRAMENTAS DE INTEGRAÇÃO

- Slack
- Github
- Trello
- RabbitMQ

---

## PARA TESTAR

### Configure o ambiente

#### Versão do java
![Versão Java](docs/images/config_java.PNG)


#### Execução com o spring boot/gradle 
![Gradle/Execução](docs/images/config_gradle.PNG)


#### RabbitMQ 
![Criando uma instancia - Parte 1](docs/images/config_rabbitmq01.PNG)
![Criando uma instancia - Parte 2](docs/images/config_rabbitmq02.PNG)
![Criando uma instancia - Parte 3](docs/images/config_rabbitmq03.PNG)
![Criando uma instancia - Parte 4](docs/images/config_rabbitmq04.PNG)


#### Execute esta aplicação e escolha um dos métodos abaixo para executar o comando de teste:
  - Executar diretamente do prompt de comando;
  - Intellij: É necessário que o terminal da IDE esteja configurado para executar com o **cmd.exe**:
![Terminal](docs/images/config_terminal.PNG)


#### Execute o teste!
Clique no símbolo verde ao lado esquerdo do comando
```shell
curl -X POST http://localhost:8080/drone/report/status --header "Content-Type: application/json" -d "@src/test/resources/ReportStatus.json"
```


Conteúdo do teste (presente no arquivo [ReportStatus.json](src/test/resources/ReportStatus.json) )
```json
{
  "idDrone": "DRONE_1232342123",
  "latitude": "123456789",
  "longitude": "-987654321",
  "temperatura": 40,
  "umidade": 90,
  "rastreamento": true
}
```

--- 

#### REFERÊNCIAS

- [CloudAMQP - RabbitMQ](https://customer.cloudamqp.com/instance/)
