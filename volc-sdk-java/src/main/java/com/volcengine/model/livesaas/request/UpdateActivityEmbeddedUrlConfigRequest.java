package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.EmbeddedUrlConfig;
import lombok.Data;


@Data
public class UpdateActivityEmbeddedUrlConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "EmbeddedUrlConfig")
    EmbeddedUrlConfig EmbeddedUrlConfig;
    @JSONField(name = "VerticalIconUrl")
    String VerticalIconUrl;
}