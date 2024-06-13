package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.HostAccountInfo;
import lombok.Data;

@Data
public class UpdateHostAccountRequest {
    @JSONField(name = "GetFollowDataUrl")
    String GetFollowDataUrl;
    @JSONField(name = "UpdateFollowDataUrl")
    String UpdateFollowDataUrl;
    @JSONField(name = "HostAccount")
    HostAccountInfo HostAccount;
}
