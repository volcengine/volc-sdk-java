package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetSignatureAndOrderListRequest {
    @JSONField(name = "SubAccount")
    String subAccount;

    @JSONField(name = "Name")
    String name;

    @JSONField(name = "PageIndex")
    int pageIndex;

    @JSONField(name = "PageSize")
    int PageSize;
}
