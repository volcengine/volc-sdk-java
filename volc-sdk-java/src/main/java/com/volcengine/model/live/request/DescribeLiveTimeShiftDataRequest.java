package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveTimeShiftDataRequest {
    @JSONField(name = "Vhosts")
    private List<String> Vhosts;

    @JSONField(name = "StartTime")
    private String StartTime;

    @JSONField(name = "EndTime")
    private String EndTime;

    @JSONField(name = "Aggregation")
    private int Aggregation;
}
