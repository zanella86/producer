package br.com.fiap.producer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {

    @Value("${exchange.topic.drone}")
    private String exchangeTopicDrone;

    @Value("${queue.normal}")
    private String queueNormal;

    @Value("${queue.alert}")
    private String queueAlert;

    @Bean
    public TopicExchange exchangeTopicDrone() {
        return new TopicExchange(this.exchangeTopicDrone, true, false);
    }

    @Bean(name = "beanQueueNormal")
    public Queue queueNormal() {
        return new Queue(this.queueNormal, true);
    }

    @Bean(name = "beanQueueAlert")
    public Queue queueAlert() {
        return new Queue(this.queueAlert, true);
    }

}
