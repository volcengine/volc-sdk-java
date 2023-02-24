package com.volcengine.service.numberpool.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: chenhui
 * @Date: 2023/02/20
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SelectNumberRequest {
    /**
     * 号码池编号
     */
    private String numberPoolNo;

    /**
     * 城市编号
     */
    private String cityCode;

    /**
     * 号码类型
     */
    private Integer numberType;

    /**
     * 降级城市
     */
    private List<String> degradeCityList;

    /**
     * 选号数量
     */
    private Integer numberCount;

    /**
     * 有绑定关系的号码
     */
    private List<String> bindNumberList;

    /**
     * 选号方式枚举
     */
    private Integer selectType;

    /**
     * 候选号码列表
     */
    private List<String> candidateNumberList;
}
