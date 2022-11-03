package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageStyleResultResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetImageStyleResultResponseBean result;

    @Data
    static public class GetImageStyleResultResponseBean {
        @JSONField(name = "ResUri")
        private String resUri;

        @JSONField(name = "RenderDetail")
        private List<RenderDetail> renderDetail;

        @JSONField(name = "Hit")
        private Boolean hit;
    }

    @Data
    static public class RenderDetail {
        @JSONField(name = "Element")
        private String element;

        @JSONField(name = "ErrMsg")
        private String errMsg;

    }
}
