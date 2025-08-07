package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CallbackConfig {
    @JSONField(name = "Id")
    Long Id;

    @JSONField(name = "CallbackType")
    Integer CallbackType;

    @JSONField(name = "EventName")
    String EventName;

    @JSONField(name = "CallbackUrls")
    String CallbackUrls;

    @JSONField(name = "FollowerUserName")
    String FollowerUserName;

    @JSONField(name = "FollowerNickName")
    String FollowerNickName;

    @JSONField(name = "AccountSecret")
    String AccountSecret;
}