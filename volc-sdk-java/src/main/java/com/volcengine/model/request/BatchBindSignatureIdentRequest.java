package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class BatchBindSignatureIdentRequest {
    @JSONField(name = "subAccount")
    String subAccount;

    @JSONField(name = "signatures")
    List<String> signatures;

    @JSONField(name = "id")
    long id;

    @JSONField(name = "purpose")
    int purpose;

    @JSONField(name = "openId")
    List<String> openId;

    @JSONField(name = "from")
    String from;
}
