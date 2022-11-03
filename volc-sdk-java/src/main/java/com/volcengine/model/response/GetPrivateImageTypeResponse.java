package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetPrivateImageTypeResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetPrivateImageTypeResponseBean result;

    @Data
    static public class GetPrivateImageTypeResponseBean {
        @JSONField(name = "Face")
        private Integer face;

        @JSONField(name = "Cloth")
        private Integer cloth;
    }
}
