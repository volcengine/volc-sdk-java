package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateAccountCustomLinkConfigRequest {
    @JSONField(name = "BackgroundMusicUrl")
    private String BackgroundMusicUrl;
    @JSONField(name = "BackgroundImageUrl")
    private String BackgroundImageUrl;
}