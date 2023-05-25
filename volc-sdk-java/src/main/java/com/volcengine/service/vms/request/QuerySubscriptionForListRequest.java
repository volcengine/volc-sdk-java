package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuerySubscriptionForListRequest {

    private String numberPoolNo;

    private String phoneNoX;

    private String phoneNoA;

    private String phoneNoB;

    private Integer status;

    private String subId;

    private String outId;

    private Integer offset;

    private Integer limit;

    private String number;

    private String phoneNoY;
}
