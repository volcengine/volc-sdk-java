package com.volcengine.service.vms.response;

import lombok.Data;

import java.util.List;

/**
 * @author wangyang
 * @date 2021/3/12
 */
@Data
public class QualificationInfoQueryVO {

    /**
     * 查询结果
     */
    private List<QualificationInfoVO> records;

    /**
     * 大小
     **/
    private Integer limit;
    /**
     * 偏移量
     **/
    private Integer offset;

    /**
     * 总量
     */
    private Integer total;
}
