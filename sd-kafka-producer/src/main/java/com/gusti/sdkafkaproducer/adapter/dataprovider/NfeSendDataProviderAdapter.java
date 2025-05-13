package com.gusti.sdkafkaproducer.adapter.dataprovider;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gusti.sdkafkaproducer.entity.Nfe;
import com.gusti.sdkafkaproducer.usecase.gateway.NfeSendGateway;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NfeSendDataProviderAdapter implements NfeSendGateway {

    private static final Logger LOGGER = LoggerFactory.getLogger(NfeSendDataProviderAdapter.class);

    @Value("${topicos.nfe.request.topic}")
    private String topic;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(Nfe nfe) {
        try {
            LOGGER.info("Sending NFe: {} on the Topic: {}", nfe.getInfnfe().getId(), topic);

            var message = objectMapper.writeValueAsString(nfe);
            kafkaTemplate.send(topic, message);
        } catch (JsonProcessingException e) {
            LOGGER.error("Error on Sending NFe: {} on the Topic: {}", nfe.getInfnfe().getId(), topic);
            throw new RuntimeException(e);
        }

    }
}