package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAXBRequest {

    private String updateType;

    private String numberPoolNo;

    private String subId;

    private Long expireTime;

    private String phoneNoB;

    private String phoneNoA;

    private String phoneNoX;

    private String userData;

    private Integer autoCreateFlag;

    private String outId;

    private String orderId;

    private String industrialId;
}
