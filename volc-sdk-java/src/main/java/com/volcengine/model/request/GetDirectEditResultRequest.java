package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetDirectEditResultRequest {
    @JSONField(name = "ReqIds")
    List<String> reqIds;
}
