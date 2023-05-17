package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetVideoUrlRequest {
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Nonce")
    String nonce;
    @JSONField(name = "codec_type")
    String codecType;
    @JSONField(name = "scene")
    String scene;
    @JSONField(name = "video_id")
    String videoId;
    @JSONField(name = "CustomVideoDefinition")
    String customVideoDefinition;
}
