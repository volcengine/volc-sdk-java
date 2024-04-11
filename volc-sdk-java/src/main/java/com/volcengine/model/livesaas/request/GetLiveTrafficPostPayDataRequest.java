package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityCreatorForm;
import com.volcengine.model.beans.livesaas.AddLivePromotionsInfo;
import lombok.Data;

import java.util.List;

@Data
public class GetLiveTrafficPostPayDataRequest {
    @JSONField(name = "ActivityIds")
    List<Long> ActivityIds;
    @JSONField(name = "ActivityCreator")
    ActivityCreatorForm ActivityCreator;
    @JSONField(name = "StartDay")
    String StartDay;
    @JSONField(name = "EndDay")
    String EndDay;
}