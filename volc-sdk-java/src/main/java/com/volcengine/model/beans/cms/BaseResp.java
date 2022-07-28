package com.volcengine.model.beans.cms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class BaseResp {
    @JSONField(name = "StatusMessage")
    String statusMessage;
    @JSONField(name = "StatusCode")
    int statusCode;
}