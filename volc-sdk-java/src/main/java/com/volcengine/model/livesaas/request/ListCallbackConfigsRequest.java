package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListCallbackConfigsRequest {
    @JSONField(name = "CallbackType")
    Integer CallbackType;

    @JSONField(name = "CallbackUrl")
    String CallbackUrl;

    @JSONField(name = "PageNumber")
    Integer PageNumber;

    @JSONField(name = "PageSize")
    Integer PageSize;

    @JSONField(name = "SubAccountName")
    String SubAccountName;
}