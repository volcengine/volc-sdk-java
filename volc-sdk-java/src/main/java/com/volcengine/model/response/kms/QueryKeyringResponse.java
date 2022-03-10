package com.volcengine.model.response.kms;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.kms.Keyring;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class QueryKeyringResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Keyrings")
        List<Keyring> keyrings;
    }
}
