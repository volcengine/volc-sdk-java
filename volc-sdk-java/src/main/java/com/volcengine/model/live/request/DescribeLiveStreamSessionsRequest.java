package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveStreamSessionsRequest {
    @JSONField(name = "DomainList")
    private List<String> DomainList;
    @JSONField(name = "Domain")
    private String Domain;

    @JSONField(name = "App")
    private String App;

    @JSONField(name = "Stream")
    private String Stream;

    @JSONField(name = "ProtocolList")
    private List<String> ProtocolList;

    @JSONField(name = "StartTime")
    private String StartTime;

    @JSONField(name = "EndTime")
    private String EndTime;

    @JSONField(name = "Aggregation")
    private int Aggregation;
}
