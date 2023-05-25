package com.volcengine.service.vms.model;

import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2022/11/18
 * @Description:
 */
@Data
public class NumberPool {

    private String numberPoolName;

    private String numberPoolNo;

    private Integer serviceType;

    private String serviceTypeName;

    private Integer subServiceType;

    private String subServiceTypeName;

    private Integer numberCount;
}
