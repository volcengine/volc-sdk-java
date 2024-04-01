package com.volcengine.service.vms.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author wangyang
 * @date 2021/3/12
 */
@Data
public class QualificationScenarioInfoFormDO {

    /**
     * 资质id
     */
    @JSONField(name = "QualificationId")
    private Integer qualificationId;

    /**
     * 资质编号
     */
    @JSONField(name = "QualificationNo")
    private String qualificationNo;

    /**
     * 场景类型
     * 11  服务营销
     * 21 办公协作
     * 22 客户服务
     */
    @JSONField(name = "SceneType")
    private Integer sceneType;

    /**
     * 场景描述
     */
    @JSONField(name = "Description")
    private String description;

    /**
     * 外呼话术
     */
    @JSONField(name= "ScenarioOfCalling")
    private String scenarioOfCalling;
}
