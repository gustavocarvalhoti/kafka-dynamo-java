package com.gusti.sdkafkaproducer.entity;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InfNfe {
    private String id;
    private String versao;
    private Ide ide;
    private Total total;
}
