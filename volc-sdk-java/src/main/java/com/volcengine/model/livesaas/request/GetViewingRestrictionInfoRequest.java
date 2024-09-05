package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetViewingRestrictionInfoRequest {
    @JSONField(name="ActivityId")
    Long activityId;
    @JSONField(name="ViewingRestrictionType")
    Integer viewingRestrictionType;

}
