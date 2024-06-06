package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SelectNumberAndBindAXBRequest {

    private String phoneNoA;

    private String phoneNoB;

    private String numberPoolNo;

    private Long expireTime;

    private Integer audioRecordFlag;

    private String cityCode;

    private String cityCodeByPhoneNo;

    private String degradeCityList;

    private String userData;

    private Integer randomFlag;

    private Integer callDisplayType;

    private Integer axConflictAxbFlag;

    private String outId;

    private Integer verifyFlag;

    private String idempotentId;

    private String voiceCode;
}
