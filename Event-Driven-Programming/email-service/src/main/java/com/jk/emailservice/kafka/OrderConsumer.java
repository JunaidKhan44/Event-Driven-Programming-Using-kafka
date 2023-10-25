package com.jk.emailservice.kafka;

import com.jk.basedomain.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author Junaid.Khan
 */

@Service
public class OrderConsumer {

    public static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics="${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}")
    public  void consume(OrderEvent orderEvent){

        LOGGER.info(String.format("Order event received in email services",
              orderEvent.toString()));
    }

}
