package com.volcengine.model.response.kms;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.kms.CustomerMasterKey;
import com.volcengine.model.beans.kms.PaginationInfo;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeKeysResponse {
    @JSONField(name = "PageInfo")
    PaginationInfo pageInfo;
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DescribeKeyringsResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Keys")
        List<CustomerMasterKey> keys;
    }
}
