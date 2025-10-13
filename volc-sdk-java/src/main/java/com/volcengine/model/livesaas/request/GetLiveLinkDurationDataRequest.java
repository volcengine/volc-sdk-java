package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityCreatorForm;
import lombok.Data;

import java.util.List;

@Data
public class GetLiveLinkDurationDataRequest {
    @JSONField(name = "ActivityIds")
    private List<Long> ActivityIds;

    @JSONField(name = "StartDay")
    private String StartDay;

    @JSONField(name = "EndDay")
    private String EndDay;

    @JSONField(name = "ActivityCreator")
    private ActivityCreatorForm ActivityCreator;
}
