package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.imagex.data.AllItem;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXCdnReuseRateAllResp {
    @JSONField(name = "ReuseRateData")
    private List<AllItem> reuseRateData;
}
