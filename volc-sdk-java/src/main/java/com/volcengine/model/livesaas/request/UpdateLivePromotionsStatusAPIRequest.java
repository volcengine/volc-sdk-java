package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class UpdateLivePromotionsStatusAPIRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "Status")
    Integer Status;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "PushUrl")
    String PushUrl;
}
