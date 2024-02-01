package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXClientCountByTimeResp {
    @JSONField(name = "ClientCountData")
    private List<CurveIntItem> clientCountData;
}
