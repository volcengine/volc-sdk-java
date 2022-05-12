package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class RoleListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "RoleMetadata")
        List<RoleResponse> roleMetadata;
        @JSONField(name = "Limit")
        Integer limit;
        @JSONField(name = "Offset")
        Integer offset;
        @JSONField(name = "Total")
        Integer total;
    }
}
