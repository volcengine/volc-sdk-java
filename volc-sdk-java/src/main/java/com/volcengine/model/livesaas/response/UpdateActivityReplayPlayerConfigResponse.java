package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ReplayPlayerConfig;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityReplayPlayerConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityReplayPlayerConfigResponseBody result;

    @Data
    public static class UpdateActivityReplayPlayerConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
