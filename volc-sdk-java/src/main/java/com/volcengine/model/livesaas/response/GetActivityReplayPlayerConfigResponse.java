package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;
import com.volcengine.model.beans.livesaas.ReplayPlayerConfig;

@Data
public class GetActivityReplayPlayerConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityReplayPlayerConfigResponseBody result;

    @Data
    public static class GetActivityReplayPlayerConfigResponseBody {
        @JSONField(name = "ReplayPlayerConfig")
        ReplayPlayerConfig ReplayPlayerConfig;
    }
}
