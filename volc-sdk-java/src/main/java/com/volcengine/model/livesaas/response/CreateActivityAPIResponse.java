package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.ImageInfo;
import com.volcengine.model.response.CommitImageUploadResponse;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class CreateActivityAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateActivityAPIResultBean result;

    @Data
    public static class CreateActivityAPIResultBean {
        @JSONField(name = "ActivityId")
        Long activityId;
    }
}
