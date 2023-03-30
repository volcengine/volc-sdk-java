package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.imagex.data.ErrorCodeItem;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXClientErrorCodeByTimeResp {
    @JSONField(name = "ErrorCodeData")
    private List<ErrorCodeItem> errorCodeData;
}
