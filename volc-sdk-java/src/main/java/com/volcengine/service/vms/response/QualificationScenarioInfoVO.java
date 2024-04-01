package com.volcengine.service.vms.response;

import lombok.Data;

/**
 * @author wangyang
 * @date 2021/2/28
 */
@Data
public class QualificationScenarioInfoVO {

    /**
     * 资质id
     */
    private Integer qualificationId;

    /**
     * 账号id
     */
    private String accountId;

    /**
     * 场景类型 11 服务营销 21 办公协作 22 客户服务
     */
    private Integer sceneType;

    /**
     * 场景类型 11 服务营销 21 办公协作 22 客户服务
     */
    private String sceneTypeStr;

    /**
     * 场景描述
     */
    private String description;

    /**
     * 外呼话术
     */
    private String scenarioOfCalling;

    /**
     * 场景主键id
     */
    private Integer sceneId;
}
