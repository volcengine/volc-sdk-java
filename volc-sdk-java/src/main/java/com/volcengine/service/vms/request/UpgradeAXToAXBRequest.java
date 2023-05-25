package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpgradeAXToAXBRequest {

    private String numberPoolNo;

    private String subId;

    private String phoneNoB;

    private String userData;

    private Integer callDisplayType;

    private String outId;
}
