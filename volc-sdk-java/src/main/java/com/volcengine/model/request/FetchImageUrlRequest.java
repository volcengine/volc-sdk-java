package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class FetchImageUrlRequest {
    @JSONField(name = "ServiceId")
    String serviceId;

    @JSONField(name = "Url")
    String url;

    @JSONField(name = "StoreKey")
    String storeKey;

    @JSONField(name = "RequestHeader")
    Map<String, List<String>> requestHeader;

    @JSONField(name = "TimeOut")
    Integer timeOut;

    @JSONField(name = "Async")
    Boolean async;

    @JSONField(name = "Callback")
    String callback;

    @JSONField(name = "Host")
    String host;

    @JSONField(name = "MD5")
    String md5;

    @JSONField(name = "CallbackBodyType")
    String callbackBodyType;

    @JSONField(name = "CallbackBody")
    String callbackBody;

    @JSONField(name = "CallbackHost")
    String callbackHost;

    @JSONField(name = "IgnoreSameKey")
    Boolean ignoreSameKey;
}
