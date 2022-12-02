package br.com.fiap.producer.config;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeConfig {

    @Value("${exchange.topic.drone}")
    private String exchangeTopicDrone;

    @Bean
    public TopicExchange exchangeTopicDrone() {
        return new TopicExchange(this.exchangeTopicDrone, true, false);
    }

}
