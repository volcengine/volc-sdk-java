package com.volcengine.service.numberpool.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NumberPoolListRequest {

    private String queryAccountId;

    private String numberPoolNo;

    private Integer serviceType;

    private Integer subServiceType;

    private String numberPoolName;

    private Integer limit;

    private Long offset;
}
