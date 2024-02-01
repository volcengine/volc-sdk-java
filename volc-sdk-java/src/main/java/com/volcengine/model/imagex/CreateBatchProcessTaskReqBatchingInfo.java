package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateBatchProcessTaskReqBatchingInfo {
    @JSONField(name = "Action")
    String action;

    @JSONField(name = "Url")
    String url;
}
