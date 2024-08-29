package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import java.util.List;
import com.volcengine.model.response.ResponseMetadata;

@Data
public class ListRobotNickNamesResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListRobotNickNamesResponseBody result;

    @Data
    public static class ListRobotNickNamesResponseBody {
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "RobotNickNames")
        List<RobotNickName> RobotNickNames;
    }
    @Data
    public static class RobotNickName {
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "NickName")
        String NickName;
    }
}


