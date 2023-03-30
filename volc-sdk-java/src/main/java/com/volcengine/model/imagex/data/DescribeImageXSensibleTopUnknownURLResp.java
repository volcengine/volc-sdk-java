package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.imagex.data.SensibleUnknownItem;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXSensibleTopUnknownURLResp {
    @JSONField(name = "TopUrlData")
    private List<SensibleUnknownItem> topUrlData;
}
