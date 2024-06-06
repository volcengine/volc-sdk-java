package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BindAXBRequest {

    private String phoneNoA;

    private String phoneNoB;

    private String phoneNoX;

    private String numberPoolNo;

    private Long expireTime;

    private Integer audioRecordFlag;

    private String userData;

    private Integer callDisplayType;

    private String outId;

    private Integer verifyFlag;

    private String voiceCode;
}
