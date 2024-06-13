package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class HostAccountInfo {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "AvatarUrl")
    String AvatarUrl;
    @JSONField(name = "HomeUrl")
    String HomeUrl;
    @JSONField(name = "IsFollowEnable")
    Integer IsFollowEnable;
    @JSONField(name = "CreateTime")
    Long CreateTime;
}
