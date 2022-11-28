package br.com.fiap.producer.senders;

import br.com.fiap.producer.domain.ReportStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class QueueSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    @Qualifier(value = "beanQueueNormal")
    private Queue queueNormal;

    @Autowired
    @Qualifier(value = "beanQueueAlert")
    private Queue queueAlert;

    public void send(ReportStatus status) {
        if(status.getUmidade() <= 15 || (status.getTemperatura() <= 0 || status.getTemperatura() >= 35) ) {
            rabbitTemplate.convertAndSend(this.queueAlert.getName(), status);   // FIXME Incluir exchange/binding
        }else {
            rabbitTemplate.convertAndSend(this.queueNormal.getName(), status);  // FIXME Incluir exchange/binding
        }
        log.info("STATUS: " + status.toString());
    }

}
