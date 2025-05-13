package com.gusti.sdkafkaconsumer.consumidor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gusti.sdkafkaconsumer.entity.Nfe;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PagamentoRequestConsumer {

    @Autowired
    private ObjectMapper mapper;

    @KafkaListener(
            topics = "${topicos.nfe.request.topic}",
            groupId = "nfe-request-1"
    )
    public void consumeMessage(String message) {
        try {
            System.out.println("Mensagem recebida:\n" + message);

            MongoOperations db = new MongoTemplate(
                    new SimpleMongoClientDatabaseFactory(MongoClients.create(), "nfe")
            );

            var nfe = mapper.readValue(message, Nfe.class);
            db.save(nfe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}