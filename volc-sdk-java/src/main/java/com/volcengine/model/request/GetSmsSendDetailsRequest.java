package com.volcengine.model.request;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetSmsSendDetailsRequest {
    @JSONField(name = "subAccount")
    String subAccount;
    @JSONField(name = "phoneNumber")
    String phoneNumber;
    @JSONField(name = "messageId")
    String messageId;
    @JSONField(name = "sendDate")
    String sendDate;
    @JSONField(name = "pageSize")
    int pageSize;
    @JSONField(name = "pageIndex")
    int pageIndex;
}
