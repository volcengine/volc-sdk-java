package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.*;
import lombok.Data;

@Data
public class DescribePlayStreamListRequest {
    @JSONField(name = "Vhost")
    String  Vhost;
    @JSONField(name = "Domain")
    String  Domain;
    @JSONField(name = "StartTime")
    String  StartTime;
    @JSONField(name = "EndTime")
    String  EndTime;
}
