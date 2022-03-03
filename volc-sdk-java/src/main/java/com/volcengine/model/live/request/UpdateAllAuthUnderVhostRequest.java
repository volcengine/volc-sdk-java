package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateAllAuthUnderVhostRequest {

    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "SceneType")
    String sceneType;
    @JSONField(name = "AuthDetailList")
    Object[] authDetailList;
}
