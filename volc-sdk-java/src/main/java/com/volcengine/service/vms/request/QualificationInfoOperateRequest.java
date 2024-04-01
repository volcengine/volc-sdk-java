package com.volcengine.service.vms.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: chenhui
 * @Date: 2024/03/26
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QualificationInfoOperateRequest {
    /**
     * 管理员信息
     */
    @JSONField(name = "QualificationAdminInfoFormDO")
    private QualificationAdminInfoFormDO qualificationAdminInfoFormDO;

    /**
     * 场景话术
     */
    @JSONField(name = "QualificationScenarioInfoFormDOList")
    private List<QualificationScenarioInfoFormDO> qualificationScenarioInfoFormDOList;

    /**
     * 资质主要信息
     */
    @JSONField(name = "QualificationMainInfoFormDO")
    private QualificationMainInfoFormDO qualificationMainInfoFormDO;
}
