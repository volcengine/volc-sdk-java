package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class EmbeddedUrlConfig {
    @JSONField(name = "MenuName")
    String MenuName;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "MobileUrl")
    String MobileUrl;
    @JSONField(name = "PCUrl")
    String PCUrl;
}

