package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AllItem {
    @JSONField(name = "Domain")
    private String domain;
    @JSONField(name = "Isp")
    private String isp;
    @JSONField(name = "Region")
    private String region;
    @JSONField(name = "RegionType")
    private String regionType;
    @JSONField(name = "Value")
    private Double value;
    @JSONField(name = "Count")
    private Long count;
}
