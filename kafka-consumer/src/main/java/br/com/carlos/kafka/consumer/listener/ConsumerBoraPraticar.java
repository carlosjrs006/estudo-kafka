package br.com.carlos.kafka.consumer.listener;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Log4j2
@Service
public class ConsumerBoraPraticar {

    @KafkaListener(topics="${topic.bora-praticar}", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info(String.format("### -> Consumed message -> %s", message));
    }


}
