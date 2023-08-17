package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SearchRequest {
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Nonce")
    String nonce;
    @JSONField(name = "DeviceType")
    String deviceType;
    @JSONField(name = "DeviceBrand")
    String deviceBrand;
    @JSONField(name = "Os")
    String os;
    @JSONField(name = "OsVersion")
    String osVersion;
    @JSONField(name = "ClientVersion")
    String clientVersion;
    @JSONField(name = "City")
    String city;
    @JSONField(name = "Keyword")
    String keyword;
    @JSONField(name = "Offset")
    int offset;
    @JSONField(name = "Count")
    int count;
    @JSONField(name = "SearchId")
    String searchId;
    @JSONField(name = "NeedVideoDetail")
    String needVideoDetail;
}
