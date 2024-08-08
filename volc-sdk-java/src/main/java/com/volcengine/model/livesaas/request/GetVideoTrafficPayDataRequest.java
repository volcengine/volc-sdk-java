package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityCreatorForm;
import lombok.Data;

import java.util.List;

@Data
public class GetVideoTrafficPayDataRequest {
    @JSONField(name = "Vids")
    List<String> Vids;
    @JSONField(name = "Creator")
    ActivityCreatorForm Creator;
    @JSONField(name = "StartDay")
    String StartDay;
    @JSONField(name = "EndDay")
    String EndDay;
}