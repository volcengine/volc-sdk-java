package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageXSummaryReq {
    @JSONField(name = "ServiceIds")
    private String serviceIds;  // 传入多个用英文逗号分隔
    @JSONField(name = "Timestamp")
    private String timestamp;
}
