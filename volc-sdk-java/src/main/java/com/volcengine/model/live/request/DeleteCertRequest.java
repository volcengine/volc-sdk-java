package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteCertRequest {

    @JSONField(name = "chainid")
    String chainID;
}
