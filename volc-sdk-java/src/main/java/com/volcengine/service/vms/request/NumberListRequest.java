package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: chenhui
 * @Date: 2022/11/18
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NumberListRequest {

    private Integer limit;

    private Long offset;

    private String queryAccountId;

    private String number;

    private List<String> numberList;

    private Integer numberStatusCode;

    private Integer numberTypeCode;

    private String numberPoolNo;

    private Integer numberPoolTypeCode;
}
