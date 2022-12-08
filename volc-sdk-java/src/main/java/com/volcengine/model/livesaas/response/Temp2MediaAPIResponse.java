package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class Temp2MediaAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Temp2MediaAPIResponseModel result;

    @Data
    public static class Temp2MediaAPIResponseModel {
        @JSONField(name = "Success")
        Boolean Success;
        @JSONField(name = "FailedList")
        List<FailedInfoAPI> FailedList;
    }

    @Data
    public static class FailedInfoAPI {
        @JSONField(name = "Id")
        String Id;
        @JSONField(name = "Name")
        String Name;
    }
}