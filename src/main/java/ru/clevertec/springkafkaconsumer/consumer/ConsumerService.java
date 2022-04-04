package ru.clevertec.springkafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.clevertec.springkafkaconsumer.model.Message;

@Service
public class ConsumerService {

    @KafkaListener(topics = "messages",groupId = "group_id",containerFactory = "kafkaListenerContainerFactory")
    public void consume(Message message){
        System.out.println("Consuming the message: " + message);
    }
}
