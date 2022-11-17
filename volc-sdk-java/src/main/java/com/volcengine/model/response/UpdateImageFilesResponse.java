package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateImageFilesResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateImageFilesResultBean result;

    @Data
    public static class UpdateImageFilesResultBean {
        @JSONField(name = "ServiceId")
        String serviceId;
        @JSONField(name = "ImageUrls")
        List<String> imageUrls;
        @JSONField(name = "FailUrls")
        List<String> failUrls;
    }
}
