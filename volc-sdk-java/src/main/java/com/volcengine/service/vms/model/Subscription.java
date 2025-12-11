package com.volcengine.service.vms.model;

import lombok.Data;

@Data
public class Subscription {

    private String subId;

    private String phoneNoA;

    private String phoneNoB;

    private String phoneNoX;

    private Integer status;

    private Integer recordFlag;

    private Long enableTime;

    private Long expireTime;

    private String phoneNoY;

    private Integer callDisplayType;

    private String callDisplayTypeName;

    private String userData;

    private String outId;

    private String phoneNoE;

    private String groupId;

    private String orderId;

    private String industrialId;
}
