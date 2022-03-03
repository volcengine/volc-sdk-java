package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class EnableAuthRequest {

    @JSONField(name = "vhost")
    String Vhost;
    @JSONField(name = "domain")
    String Domain;
    @JSONField(name = "app")
    String App;
    @JSONField(name = "sceneType")
    String SceneType;
}
