package com.bytedanceapi.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetSpaceResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    private List<ResultItem> result;

    @Data
    public static class ResultItem {
        @JSONField(name = "SpaceName")
        private String spaceName;
        @JSONField(name = "AccessKey")
        private String accessKey;
        @JSONField(name = "Region")
        private String region;
        @JSONField(name = "ProjectName")
        private String projectName;
        @JSONField(name = "Bucket")
        private String bucket;
        @JSONField(name = "Description")
        private String description;
        @JSONField(name = "Status")
        private String status;
        @JSONField(name = "CreatedAt")
        private String createdAt;
        @JSONField(name = "Type")
        private String type;
    }
}
