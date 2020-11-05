package com.bytedanceapi.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListUsersResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "UserMetadata")
        List<UserMetadataBean> userMetadataBeanList;
        @JSONField(name = "Limit")
        int limit;
        @JSONField(name = "Offset")
        int offset;
        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class UserMetadataBean {
        @JSONField(name = "Status")
        private String status;
        @JSONField(name = "CreateDate")
        private String createDate;
        @JSONField(name = "UpdateDate")
        private String updateDate;
        @JSONField(name = "Trn")
        private String trn;
        @JSONField(name = "UserName")
        private String userName;
        @JSONField(name = "Description")
        private String description;
        @JSONField(name = "DisplayName")
        private String displayName;
        @JSONField(name = "Email")
        private String email;
        @JSONField(name = "EmailIsVerify")
        private boolean emailIsVerify;
        @JSONField(name = "MobilePhone")
        private String mobilePhone;
        @JSONField(name = "MobilePhoneIsVerify")
        private boolean mobilePhoneIsVerify;
    }
}
