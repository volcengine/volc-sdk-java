package com.volcengine.service.vms.model;

import lombok.Data;

import java.util.List;

/**
 * @Author: chenhui
 * @Date: 2022/11/18
 * @Description:
 */
@Data
public class NumberList {

    private Integer limit;

    private Long offset;

    private Long total;

    private List<Number> records;
}
