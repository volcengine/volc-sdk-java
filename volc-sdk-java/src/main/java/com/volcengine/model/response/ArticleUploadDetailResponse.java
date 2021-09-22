package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ArticleUploadDetailResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UploadResult result;

    @Data
    public static class UploadResult {
        @JSONField(name = "BatchId")
        String batchId;
        @JSONField(name = "UploadVOList")
        List<ArticleUploadVO> uploadVOList;
    }

    @Data
    public static class ArticleUploadVO {
        @JSONField(name = "OpenId")
        String openId;
        @JSONField(name = "GroupId")
        String groupId;
        @JSONField(name = "Reason")
        String reason;
        @JSONField(name = "CreateTime")
        long createTime;
        @JSONField(name = "UploadStatus")
        String uploadStatus;
        @JSONField(name = "FailedType")
        String failedType;
        @JSONField(name = "ReqBody")
        String reqBody;
        @JSONField(name = "SourceName")
        String sourceName;
        @JSONField(name = "GroupSource")
        String groupSource;
        @JSONField(name = "GenerateType")
        String generateType;
        @JSONField(name = "RequestId")
        String requestId;
    }
}
