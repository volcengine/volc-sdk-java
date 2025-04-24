package com.volcengine.service.vms.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthQueryResponse {

    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    private AuthQueryResult result;

    @Data
    public static class AuthQueryResult {

        /**
         * 失败原因
         */
        private String failReason;

        /**
         * 报备状态
         */
        private Integer status;
    }
}
