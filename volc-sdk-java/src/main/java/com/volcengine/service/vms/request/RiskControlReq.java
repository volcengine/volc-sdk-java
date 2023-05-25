package com.volcengine.service.vms.request;

import lombok.Data;

@Data
public class RiskControlReq {

    private String customerNumberList;

    private Integer businessLineId;

    private Integer callType;
}
