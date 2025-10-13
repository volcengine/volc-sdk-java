package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetSignatureAndOrderListRequest {
    @JSONField(name = "subAccounts")
    List<String> subAccounts;

    @JSONField(name = "signature")
    String signature;

    @JSONField(name = "status")
    int status;

    @JSONField(name = "pageIndex")
    int pageIndex;

    @JSONField(name = "pageSize")
    int pageSize;
}
