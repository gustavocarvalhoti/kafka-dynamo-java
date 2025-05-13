package com.gusti.sdkafkaproducer.usecase.gateway;

import com.gusti.sdkafkaproducer.entity.Nfe;

public interface NfeSendGateway {
    void send(Nfe nfe);
}
