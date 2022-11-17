package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SubAccountRequest {
    @JSONField(name = "SubAccount")
    String subAccount;

    @JSONField(name = "PageIndex")
    int pageIndex;

    @JSONField(name = "PageSize")
    int pageSize;
}
