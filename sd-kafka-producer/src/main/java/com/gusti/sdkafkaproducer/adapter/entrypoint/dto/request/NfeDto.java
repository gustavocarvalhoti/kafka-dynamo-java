package com.gusti.sdkafkaproducer.adapter.entrypoint.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class NfeDto {

    @Valid
    @NotNull(message = "InfNfe must not be null")
    @JsonProperty("infNFe")
    private InfNfeDto infnfe;

}