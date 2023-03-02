package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXHitRateRequestDataResp {
    @JSONField(name = "HitRateData")
    private List<ServiceDomainDataItem> hitRateData;
}
