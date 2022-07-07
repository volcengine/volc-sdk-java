package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.*;
import lombok.Data;

import java.util.List;

@Data
public class DescribePullToPushBandwidthDataRequest {
    @JSONField(name = "DomainList")
    private List<String> DomainList;

    @JSONField(name = "DstAddrTypeList")
    private List<String> DstAddrTypeList;

    @JSONField(name = "StartTime")
    private String StartTime;

    @JSONField(name = "EndTime")
    private String EndTime;

    @JSONField(name = "Aggregation")
    private int Aggregation;

    @JSONField(name = "ShowDetail")
    private boolean ShowDetail;
}
