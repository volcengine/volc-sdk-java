package com.volcengine.service.vms.model;

import lombok.Data;

import java.util.List;

@Data
public class NumberListScroll {

    private Integer limit;

    private Long total;

    private List<Number> records;

    private String nextToken;

    private Long nextTokenExpireAt;

    private Boolean hasMore;
}
