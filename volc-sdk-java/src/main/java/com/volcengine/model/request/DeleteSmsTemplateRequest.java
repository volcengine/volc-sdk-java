package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteSmsTemplateRequest {
    @JSONField(name = "subAccount")
    String subAccount;

    @JSONField(name = "id")
    String id;

    @JSONField(name = "isOrder")
    boolean isOrder;
}
