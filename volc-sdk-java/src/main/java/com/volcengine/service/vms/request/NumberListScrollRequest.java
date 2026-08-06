package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NumberListScrollRequest {

    private Integer limit;

    private String queryAccountId;

    private String number;

    private List<String> numberList;

    private Integer numberStatusCode;

    private Integer numberTypeCode;

    private String numberPoolNo;

    private Integer numberPoolTypeCode;

    private String nextToken;
}
