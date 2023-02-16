package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class GetAdvertisementDataAPIV2Request {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Channel")
    String Channel;
}