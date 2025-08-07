package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateAccountCustomLinkConfigRequest {
    @JSONField(name = "BackgroundMusicUrl")
    String BackgroundMusicUrl;
    @JSONField(name = "BackgroundImageUrl")
    String BackgroundImageUrl;
}