package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateFloatingAdvertisementRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "ImageUrl")
    String ImageUrl;
    @JSONField(name = "IsEnable")
    Integer IsEnable;
    @JSONField(name = "HomeUrl")
    String HomeUrl;
    @JSONField(name = "IsCloseEnable")
    Integer IsCloseEnable;
    @JSONField(name = "EnableFloating")
    Boolean EnableFloating;
}
