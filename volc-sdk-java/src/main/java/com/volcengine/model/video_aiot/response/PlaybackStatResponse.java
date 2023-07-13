package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class PlaybackStatResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    PlaybackStat result;

    @Data
    public static class PlaybackStat {
        @JSONField(name = "Status")
        private String status;
    }

}
