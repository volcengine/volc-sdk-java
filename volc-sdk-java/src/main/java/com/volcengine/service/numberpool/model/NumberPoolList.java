package com.volcengine.service.numberpool.model;

import lombok.Data;

import java.util.List;

/**
 * @Author: chenhui
 * @Date: 2022/11/18
 * @Description:
 */
@Data
public class NumberPoolList {

    private Integer limit;

    private Long offset;

    private Long total;

    private List<NumberPool> records;
}
