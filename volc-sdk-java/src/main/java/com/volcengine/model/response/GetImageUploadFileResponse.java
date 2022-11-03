package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageUploadFileResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetImageUploadFileResponseBean result;

    @Data
    static public class GetImageUploadFileResponseBean {
        @JSONField(name = "ServiceId")
        private String serviceId;

        @JSONField(name = "StoreUri")
        private String storeUri;

        @JSONField(name = "LastModified")
        private String lastModified;

        @JSONField(name = "FileSize")
        private Integer fileSize;

        @JSONField(name = "Marker")
        private Long marker;
    }
}
