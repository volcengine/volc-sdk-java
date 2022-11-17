package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
@Data
public class ConversionRequest {
    @JSONField(name = "MessageIDs")
    List<String> messageIDs;
    @JSONField(name = "Type")
    int type;
}
