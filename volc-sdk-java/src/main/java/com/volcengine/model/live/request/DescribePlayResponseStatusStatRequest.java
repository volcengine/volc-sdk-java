package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribePlayResponseStatusStatRequest {
    @JSONField(name = "DomainList")
    private List<String> DomainList;

    @JSONField(name = "StartTime")
    private String StartTime;

    @JSONField(name = "EndTime")
    private String EndTime;

    @JSONField(name = "Aggregation")
    private int Aggregation;

    @JSONField(name = "ProvinceList")
    private List<String> ProvinceList;

    @JSONField(name = "ISPList")
    private List<String> ISPList;
}
