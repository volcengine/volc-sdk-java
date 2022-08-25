package com.volcengine.model.stream.log;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ProductClickLogRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "GroupId")
    String groupId;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "ProductId")
    String productId;
    @JSONField(name = "Category")
    String category;
    @JSONField(name = "EntranceForm")
    String entranceForm;
    @JSONField(name = "EventTime")
    long eventTime;
    @JSONField(name = "Dt")
    String dt;
    @JSONField(name = "Os")
    String os;
    @JSONField(name = "OsVersion")
    String osVersion;
    @JSONField(name = "ClientVersion")
    String clientVersion;
    @JSONField(name = "DeviceBrand")
    String deviceBrand;
    @JSONField(name = "ReqId")
    String reqId;
}
