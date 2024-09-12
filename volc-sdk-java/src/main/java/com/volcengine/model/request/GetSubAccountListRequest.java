package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetSubAccountListRequest {
    @JSONField(name = "subAccount")
    String subAccount;

    @JSONField(name = "subAccountName")
    String subAccountName;

    @JSONField(name = "pageIndex")
    int pageIndex;

    @JSONField(name = "pageSize")
    int pageSize;
}
