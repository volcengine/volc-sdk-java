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

    @JSONField(name = "TimeOut")
    Integer timeOut;

    @JSONField(name = "RequestHeader")
    Map<String, List<String>> requestHeader;
}
