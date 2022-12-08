package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class QueryUploadMediaByURLResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    QueryUploadMediaByURLResponseBody result;

    @Data
    public static class QueryUploadMediaByURLResponseBody {
        @JSONField(name = "TaskList")
        List<UploadMediaByURLTask> TaskList;
    }

    @Data
    public static class UploadMediaByURLTask {
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "SourceURL")
        String SourceURL;
        @JSONField(name = "State")
        String State;
        @JSONField(name = "Vid")
        String Vid;
    }
}