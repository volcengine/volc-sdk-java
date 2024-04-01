package com.volcengine.service.vms.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author wangyang
 * @date 2021/3/9
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QualificationInfoQueryRequest {
    /**
     * 审核状态
     * 审核中 1
     * 审核通过 2
     * 审核失败 3
     */
    @JSONField(name = "ApprovalStatus")
    private Integer approvalStatus;
    /**
     * 资质主体名字（模糊查询）
     **/
    @JSONField(name= "QualificationEntityQueryPattern")
    private String qualificationEntityQueryPattern;
    /**
     * 资质编号列表
     */
    @JSONField(name = "QualificationNoList")
    private List<String> qualificationNoList;
    /**
     * 大小
     **/
    @JSONField(name = "Limit")
    private Integer limit = 20;
    /**
     * 偏移量
     **/
    @JSONField(name = "Offset")
    private Integer offset = 0;
}
