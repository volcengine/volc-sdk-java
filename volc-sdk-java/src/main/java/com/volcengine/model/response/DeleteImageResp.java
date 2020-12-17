package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DeleteImageResp {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    com.volcengine.model.response.DeleteImageResp.DeleteImageResultBean result;

    @Data
    public static class DeleteImageResultBean {
        @JSONField(name = "ServiceId")
        String serviceId;
        @JSONField(name = "DeletedFiles")
        List<String> deletedFiles;
    }
}
