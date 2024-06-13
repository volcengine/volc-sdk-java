package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListHostAccountsRequest {
    @JSONField(name = "PageNo")
    Integer PageNo;
    @JSONField(name = "PageItemCount")
    Integer PageItemCount;
    @JSONField(name = "HostAccountId")
    Long HostAccountId;
    @JSONField(name = "HostAccountName")
    String HostAccountName;
}
