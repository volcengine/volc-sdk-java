package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.EmbeddedWebUrlAPIItem;
import lombok.Data;

import java.util.Map;

@Data
public class UpdateActivityEmbeddedUrlAPIRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "EmbeddedWebAPIUrls")
    Map<String, EmbeddedWebUrlAPIItem> EmbeddedWebAPIUrls;
}