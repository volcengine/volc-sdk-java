package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListRobotCommentsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListRobotCommentsResponse.ListRobotCommentsResponseBody result;

    @Data
    public static class ListRobotCommentsResponseBody {
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "RobotComments")
        List<RobotComment> RobotComments;
    }
    @Data
    public static class RobotComment{
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "CommentContent")
        String CommentContent;
    }
}
