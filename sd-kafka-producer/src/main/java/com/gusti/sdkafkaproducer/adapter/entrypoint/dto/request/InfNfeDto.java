package com.gusti.sdkafkaproducer.adapter.entrypoint.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class InfNfeDto {

    @NotBlank(message = "Id must not be null")
    private String id;

    @NotBlank(message = "Versao must not be null")
    private String versao;

    @Valid
    private IdeDto ide;

    @Valid
    private TotalDto total;
}
