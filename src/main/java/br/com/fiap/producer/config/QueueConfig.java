package br.com.fiap.producer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {

    @Value("${queue.drone}")
    private String name;

    @Bean
    public Queue queue() {
        return new Queue(this.name, true);
    }

}
