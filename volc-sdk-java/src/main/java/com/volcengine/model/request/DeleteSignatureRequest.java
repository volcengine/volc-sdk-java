package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteSignatureRequest {
    @JSONField(name = "SubAccount")
    String subAccount;

    @JSONField(name = "Id")
    String id;

    @JSONField(name = "IsOrder")
    boolean isOrder;
}
