package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXCdnErrorCodeAllResp {
    @JSONField(name = "ErrorCodeData")
    private List<ErrorCodeAllItem> errorCodeData;
}
