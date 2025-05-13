package com.gusti.sdkafkaproducer.entity;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IcmsTot {
    private Double vbc;
    private Double vicms;
    private Double vbcst;
    private Double vst;
    private Double vprod;
    private Double vfrete;
    private Double vseg;
    private Double vdesc;
    private Double vii;
    private Double vipi;
    private Double vpis;
    private Double vcofins;
    private Double voutro;
    private Double vnf;
}
