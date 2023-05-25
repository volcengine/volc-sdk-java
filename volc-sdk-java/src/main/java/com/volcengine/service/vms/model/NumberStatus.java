package com.volcengine.service.vms.model;

import lombok.Data;


@Data
public class NumberStatus {

    private String customerNumber;

    private Integer businessLineId;

    private int status;

    private String startTime;

    private String expiryTime;

    private String reason;

    private Integer highRisk;

    private Integer treatmentId;

    private String treatmentName;
}
