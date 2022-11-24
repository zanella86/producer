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

---

## PARA TESTAR

Acesse a url abaixo:

```shell
curl -X POST http://localhost:8080/drone/report/status -H "Content-Type: application/json" -d "@src/test/resources/ReportStatus.json"
```

```shell
curl --header "Content-Type: application/json" -d "@src/test/resources/ReportStatus.json" http://localhost:8080/drone/report/status
```

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

#### FONTES

- [CloudAMQP - RabbitMQ](https://customer.cloudamqp.com/instance/)
