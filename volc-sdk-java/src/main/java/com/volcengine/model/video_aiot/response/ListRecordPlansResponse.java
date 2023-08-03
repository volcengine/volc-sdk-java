package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListRecordPlansResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    RecordPlans result;

    @Data
    public static class RecordPlans {
        @JSONField(name = "PageResult")
        PageResultResponse pageResult;
        @JSONField(name = "List")
        List<RecordPlanResponse.RecordPlan> list;
    }
}
