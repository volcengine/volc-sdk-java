package com.volcengine.model.live;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CallbackDetail {

    @JSONField(name = "CallbackType")
    String callbackType;
    @JSONField(name = "URL")
    String URL;
}
