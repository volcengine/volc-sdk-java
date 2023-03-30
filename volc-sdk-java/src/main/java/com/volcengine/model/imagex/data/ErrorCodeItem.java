package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ErrorCodeItem {
    @JSONField(name = "ErrorCode")
    private String errorCode;
    @JSONField(name = "Count")
    private String count;
    @JSONField(name = "Data")
    private List<CurveIntItem> data;
}
