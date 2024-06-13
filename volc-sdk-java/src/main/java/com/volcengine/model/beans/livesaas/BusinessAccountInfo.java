package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class BusinessAccountInfo {
    @JSONField(name = "AccountName")
    String AccountName;
    @JSONField(name = "AccountHeadImage")
    String AccountHeadImage;
    @JSONField(name = "AccountHeadRedirectUrl")
    String AccountHeadRedirectUrl;
    @JSONField(name = "HostAccountId")
    Long HostAccountId;
    @JSONField(name = "IsFollowEnable")
    Integer IsFollowEnable;
}
