package com.volcengine.model.response.kms;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.kms.CustomerMasterKey;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateKeyResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DescribeKeyringsResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Key")
        CustomerMasterKey key;
    }
}
