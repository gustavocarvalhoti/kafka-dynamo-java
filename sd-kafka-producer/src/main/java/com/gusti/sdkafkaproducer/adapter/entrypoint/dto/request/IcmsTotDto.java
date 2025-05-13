package com.gusti.sdkafkaproducer.adapter.entrypoint.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class IcmsTotDto {

    @JsonProperty("vBC")
    private Double vbc;

    @JsonProperty("vICMS")
    private Double vicms;

    @JsonProperty("vBCST")
    private Double vbcst;

    @JsonProperty("vST")
    private Double vst;

    @JsonProperty("vProd")
    private Double vprod;

    @JsonProperty("vFrete")
    private Double vfrete;

    @JsonProperty("vSeg")
    private Double vseg;

    @JsonProperty("vDesc")
    private Double vdesc;

    @JsonProperty("vII")
    private Double vii;

    @JsonProperty("vIPI")
    private Double vipi;

    @JsonProperty("vPIS")
    private Double vpis;

    @JsonProperty("vCOFINS")
    private Double vcofins;

    @JsonProperty("vOutro")
    private Double voutro;

    @JsonProperty("vNF")
    private Double vnf;
}
