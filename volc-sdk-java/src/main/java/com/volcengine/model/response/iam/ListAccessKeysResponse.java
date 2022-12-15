package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListAccessKeysResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "AccessKeyMetadata")
        List<AccessKeyMetaBean> accessKeyMetaList;
    }

    @Data
    public static class AccessKeyMetaBean {
        @JSONField(name = "AccessKeyId")
        private String accessKeyId;
        @JSONField(name = "CreateDate")
        private String createDate;
        @JSONField(name = "UpdateDate")
        private String updateDate;
        @JSONField(name = "UserName")
        private String userName;
        @JSONField(name = "Status")
        private String status;
    }
}
