package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXCDNTopRequestDataResp {
    @JSONField(name = "Count")
    private Long count;
    @JSONField(name = "topValue")
    private List<TopValueItem> TopValue;
    @JSONField(name = "TotalValue")
    private Double totalValue;
}
