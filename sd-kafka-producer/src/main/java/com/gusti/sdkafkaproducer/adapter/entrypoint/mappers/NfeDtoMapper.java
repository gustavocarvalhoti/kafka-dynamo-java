package com.gusti.sdkafkaproducer.adapter.entrypoint.mappers;

import com.gusti.sdkafkaproducer.adapter.entrypoint.dto.request.NfeDto;
import com.gusti.sdkafkaproducer.entity.Nfe;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface NfeDtoMapper {
    Nfe toEntity(NfeDto nfe);
}
