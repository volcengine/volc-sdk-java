package com.volcengine.model.response;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateSignatureIdentResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    String result;
}
