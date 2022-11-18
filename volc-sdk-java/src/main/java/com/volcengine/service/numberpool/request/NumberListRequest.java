package com.volcengine.service.numberpool.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private Integer numberStatusCode;

    private Integer numberTypeCode;

    private String numberPoolNo;

    private Integer numberPoolTypeCode;
}
