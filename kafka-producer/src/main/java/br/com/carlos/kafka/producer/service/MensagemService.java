package br.com.carlos.kafka.producer.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class MensagemService {

   @Value("${topic.bora-praticar}")
    private String topicBoraPraticar;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        log.info("Mensagem -> {}", message);
        this.kafkaTemplate.send(topicBoraPraticar, message);
    }

}
