package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class UpdatePopularitySettingsRequest {
    @JSONField(name = "IsVirtualPopularityEnable")
    Integer IsVirtualPopularityEnable;
    @JSONField(name = "VirtualPeopleIncreaseMin")
    Long VirtualPeopleIncreaseMin;
    @JSONField(name = "VirtualPeopleIncreaseMax")
    Long VirtualPeopleIncreaseMax;
    @JSONField(name = "VirtualPeopleReduceMin")
    Long VirtualPeopleReduceMin;
    @JSONField(name = "VirtualPeopleReduceMax")
    Long VirtualPeopleReduceMax;
    @JSONField(name = "VirtualPopularity")
    Long VirtualPopularity;
    @JSONField(name = "ActivityId")
    Long ActivityId;
}