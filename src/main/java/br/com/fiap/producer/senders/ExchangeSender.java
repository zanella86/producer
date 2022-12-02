package br.com.fiap.producer.senders;

import br.com.fiap.producer.domain.ReportStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ExchangeSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    TopicExchange topicExchange;

    public void send(ReportStatus status) {
        if(status.getUmidade() <= 15 || (status.getTemperatura() <= 0 || status.getTemperatura() >= 35) ) {
            rabbitTemplate.convertAndSend(topicExchange.getName(), "alert", status);
        }else {
            rabbitTemplate.convertAndSend(topicExchange.getName(),"normal", status);
        }
        log.info("STATUS: " + status);
    }

}
