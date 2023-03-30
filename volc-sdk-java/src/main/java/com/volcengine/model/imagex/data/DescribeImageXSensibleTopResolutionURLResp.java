package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.imagex.data.SensibleResolutionItem;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXSensibleTopResolutionURLResp {
    @JSONField(name = "TopUrlData")
    private List<SensibleResolutionItem> topUrlData;
}
