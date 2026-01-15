package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityBonusTask;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityBonusTasksResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListActivityBonusTasksResponseBody result;

    @Data
    public static class ListActivityBonusTasksResponseBody {
        @JSONField(name = "ActivityBonusTasks")
        List<ActivityBonusTask> ActivityBonusTasks;

        @JSONField(name = "Total")
        Integer Total;
    }
}

