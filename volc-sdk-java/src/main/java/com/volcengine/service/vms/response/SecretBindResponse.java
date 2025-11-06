package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class SecretBindResponse {

    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    private SecretBindResult result;

    @Data
    public static class SecretBindResult {

        private String phoneNoX;

        private String subId;

        private Integer status;

        private String phoneNoE;

        private String phoneNoXCityCode;

        private String phoneNoA;

        private String phoneNoACityCode;

        private String phoneNoB;

        private String phoneNoBCityCode;

        private String phoneNoY;

        private String ybSubId;

        private Integer ybStatus;

        private String groupId;
    }
}
