package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.imagex.data.ErrorCodeAllItem;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXUploadErrorCodeAllResp {
    @JSONField(name = "ErrorCodeData")
    private List<ErrorCodeAllItem> errorCodeData;
}
