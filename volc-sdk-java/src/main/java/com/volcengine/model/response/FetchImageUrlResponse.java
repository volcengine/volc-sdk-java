package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class FetchImageUrlResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    FetchImageUrlResponseBean result;

    @Data
    public static class FetchImageUrlResponseBean {
        @JSONField(name = "Url")
        private String url;

        @JSONField(name = "StoreUri")
        private String storeUri;

        @JSONField(name = "FSize")
        private Integer fSize;

        @JSONField(name = "ImageWidth")
        private Integer imageWidth;

        @JSONField(name = "ImageHeight")
        private Integer imageHeight;

        @JSONField(name = "FrameCnt")
        private Integer frameCnt;

        @JSONField(name = "Duration")
        private Integer duration;

        @JSONField(name = "ImageFormat")
        private String imageFormat;
    }
}
