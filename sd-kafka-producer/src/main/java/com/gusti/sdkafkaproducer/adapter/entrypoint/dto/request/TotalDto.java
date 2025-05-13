package com.gusti.sdkafkaproducer.adapter.entrypoint.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class TotalDto {

    @JsonProperty("ICMSTot")
    private IcmsTotDto icmstot;
}
