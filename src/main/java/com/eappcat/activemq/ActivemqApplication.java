package com.eappcat.activemq;

import org.apache.activemq.xbean.BrokerFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class ActivemqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqApplication.class, args);
    }

    @Bean
    public BrokerFactoryBean activemq() throws Exception {
        BrokerFactoryBean broker = new BrokerFactoryBean();
        broker.setConfig(new ClassPathResource("activemq.xml"));
        broker.setStart(true);
        return broker;
    }

}
