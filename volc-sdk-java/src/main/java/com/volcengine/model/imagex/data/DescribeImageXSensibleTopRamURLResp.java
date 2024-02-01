package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXSensibleTopRamURLResp {
    @JSONField(name = "TopUrlData")
    private List<SensibleRamItem> topUrlData;
}
