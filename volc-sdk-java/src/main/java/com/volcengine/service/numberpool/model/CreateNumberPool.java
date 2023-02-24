package com.volcengine.service.numberpool.model;

import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2023/02/20
 * @Description:
 */
@Data
public class CreateNumberPool {
    private String name;

    private String numberPoolNo;

    private Integer serviceType;

    private Integer subServiceType;
}
