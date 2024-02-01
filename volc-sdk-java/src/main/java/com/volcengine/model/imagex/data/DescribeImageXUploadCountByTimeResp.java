package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXUploadCountByTimeResp {
    @JSONField(name = "UploadCountData")
    private List<CurveIntItem> uploadCountData;
}
