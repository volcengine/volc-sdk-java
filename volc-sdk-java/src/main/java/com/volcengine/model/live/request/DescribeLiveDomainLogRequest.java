package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeLiveDomainLogRequest {
    @JSONField(name = "DomainList")
    private String DomainList;
    @JSONField(name = "StartTime")
    private String StartTime;
    @JSONField(name = "EndTime")
    private String EndTime;
    @JSONField(name = "Page")
    private int Page;
    @JSONField(name = "Size")
    private int Size;
}
