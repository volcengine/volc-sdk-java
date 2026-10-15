package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.CloudEditTask;
import com.volcengine.model.beans.livesaas.HighlightClipConfig;
import com.volcengine.model.beans.livesaas.HighlightClipVideo;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetHighlightClipTaskDetailResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "Vid")
        String Vid;
        @JSONField(name = "Title")
        String Title;
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "Scene")
        Integer Scene;
        @JSONField(name = "UserPrompt")
        String UserPrompt;
        @JSONField(name = "HighlightClipConfig")
        HighlightClipConfig HighlightClipConfig;
        @JSONField(name = "CoverImage")
        String CoverImage;
        @JSONField(name = "CreateTime")
        Long CreateTime;
        @JSONField(name = "HighlightClipVideoList")
        List<HighlightClipVideo> HighlightClipVideoList;
        @JSONField(name = "CloudEditTaskList")
        List<CloudEditTask> CloudEditTaskList;
    }
}
