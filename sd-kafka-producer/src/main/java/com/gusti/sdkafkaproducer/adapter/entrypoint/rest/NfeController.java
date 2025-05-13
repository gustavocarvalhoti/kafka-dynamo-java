package com.gusti.sdkafkaproducer.adapter.entrypoint.rest;

import com.gusti.sdkafkaproducer.adapter.entrypoint.dto.request.NfeDto;
import com.gusti.sdkafkaproducer.adapter.entrypoint.mappers.NfeDtoMapper;
import com.gusti.sdkafkaproducer.usecase.NfeUseCase;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nfe")
public class NfeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NfeController.class);

    @Autowired
    private NfeUseCase nfeUseCase;

    private final NfeDtoMapper mapper;

    public NfeController(NfeDtoMapper mapper) {
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<String> send(@Valid @RequestBody NfeDto nfeDto) {
        LOGGER.info("Sending NFe: {}", nfeDto.getInfnfe().getId());

        var nfe = mapper.toEntity(nfeDto);
        nfeUseCase.send(nfe);

        return ResponseEntity.ok("NFe sent successfully.");
    }

}