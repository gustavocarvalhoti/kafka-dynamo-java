package com.gusti.sdkafkaproducer.adapter.entrypoint.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@NotNull
public class IdeDto {

    @JsonProperty("cUF")
    private Integer cuf;

    @JsonProperty("cNF")
    private Integer cnf;

    @JsonProperty("natOp")
    private String natop;

    @JsonProperty("indPag")
    private Integer indpag;

    @JsonProperty("mod")
    private Integer mod;

    @JsonProperty("serie")
    private Integer serie;

    @JsonProperty("nNF")
    private String nnf;

    @JsonProperty("dEmi")
    private String demi;

    @JsonProperty("dSaiEnt")
    private String dsaient;

    @JsonProperty("tpNF")
    private Integer tpnf;

    @JsonProperty("cMunFG")
    private String cmunfg;

    @JsonProperty("tpImp")
    private Integer tpimp;

    @JsonProperty("tpEmis")
    private Integer tpemis;

    @JsonProperty("cDV")
    private Integer cdv;

    @JsonProperty("tpAmb")
    private Integer tpamb;

    @JsonProperty("finNFe")
    private Integer finnfe;

    @JsonProperty("procEmi")
    private Integer procemi;

    @JsonProperty("verProc")
    private String verproc;

}
