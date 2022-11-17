package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetDirectEditResultResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    List<ResultBean> result;

    @Data
    public static class ResultBean {
        @JSONField(name = "ReqId")
        String reqId;
        @JSONField(name = "EditParam")
        Map<String, Object> editParam;
        @JSONField(name = "Priority")
        Integer priority;
        @JSONField(name = "Status")
        String status;
        @JSONField(name = "TaskId")
        String taskId;
        @JSONField(name = "OutputVid")
        String outputVid;
        @JSONField(name = "CallbackUri")
        String callbackUri;
        @JSONField(name = "CallbackArgs")
        String callbackArgs;
    }
}
