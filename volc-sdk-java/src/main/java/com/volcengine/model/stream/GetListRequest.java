package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetListRequest {
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Nonce")
    String nonce;
    @JSONField(name = "Category")
    String category;
    @JSONField(name = "Ouid")
    String ouid;
    @JSONField(name = "Dt")
    String dt;
    @JSONField(name = "DeviceBrand")
    String deviceBrand;
    @JSONField(name = "Os")
    String os;
    @JSONField(name = "OsVersion")
    String osVersion;
    @JSONField(name = "ClientVersion")
    String clientVersion;
    @JSONField(name = "AllowStick")
    int allowStick;
    @JSONField(name = "StressTest")
    int stressTest;
    @JSONField(name = "Ip")
    String ip;
    @JSONField(name = "City")
    String city;
    @JSONField(name = "Province")
    String province;
    @JSONField(name = "District")
    String district;
    @JSONField(name = "OffPersonalRec")
    int offPersonalRec;
}
