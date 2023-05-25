package com.volcengine.service.vms.request;

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
public class EnableNumberRequest {
    /**
     * 按照id进行启用和停用
     */
    private Integer id;

    /**
     * 号码
     */
    private String number;

    /**
     * 使动标识，1-启用，2-停用
     */
    private Integer enableCode;

    /**
     * 备注
     */
    private String remark;

    /**
     * id列表
     */
    private List<Integer> idList;

    /**
     * 号码列表
     */
    private List<String> numberList;
}
