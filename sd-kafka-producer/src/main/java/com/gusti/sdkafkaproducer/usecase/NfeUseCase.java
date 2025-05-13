package com.gusti.sdkafkaproducer.usecase;

import com.gusti.sdkafkaproducer.entity.Nfe;
import com.gusti.sdkafkaproducer.usecase.gateway.NfeSendGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NfeUseCase {

    private static final Logger LOGGER = LoggerFactory.getLogger(NfeUseCase.class);

    @Autowired
    private NfeSendGateway nfeSendGateway;

    public void send(Nfe nfe) {
        LOGGER.info("Sending NFe: {}", nfe.getInfnfe().getId());
        nfeSendGateway.send(nfe);
    }

}