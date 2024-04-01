package com.volcengine.service.vms.response;

import lombok.Data;

import java.util.List;

/**
 * @author wangyang
 * @date 2021/3/12
 */
@Data
public class QualificationInfoVO {
    /**
     * 管理员信息
     */
    private QualificationAdminInfoVO qualificationAdminInfoVO;

    /**
     * 场景话术
     */
    private List<QualificationScenarioInfoVO> qualificationScenarioInfoVOList;

    /**
     * 资质主要信息
     */
    private QualificationMainInfoVO qualificationMainInfoVO;
}
