package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ManagerPullPushDomainBindRequest {

    @JSONField(name = "PullDomain")
    String pullDomain;
    @JSONField(name = "PushDomain")
    String pushDomain;

}
