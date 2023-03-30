package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ErrorCodeAllDetailsItem {
    @JSONField(name = "ErrorCode")
    private String errorCode;
    @JSONField(name = "ErrorCodeDesc")
    private String errorCodeDesc;
    @JSONField(name = "Value")
    private Long value;
}
