package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CustomLinkConfig {
    @JSONField(name = "BackgroundImageUrl")
    String BackgroundImageUrl;
    @JSONField(name = "BackgroundMusicUrl")
    String BackgroundMusicUrl;
    @JSONField(name = "Status")
    Integer Status;
}