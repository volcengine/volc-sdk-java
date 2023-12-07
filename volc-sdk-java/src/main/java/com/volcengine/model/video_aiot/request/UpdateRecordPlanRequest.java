package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.video_aiot.common;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class UpdateRecordPlanRequest {
    @JSONField(name = "PlanID")
    String planID;
    @JSONField(name = "PlanName")
    String planName;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "BindTemplate")
    String bindTemplate;
    @JSONField(name = "StreamingIndex")
    int streamingIndex;
    @JSONField(name = "Resolution")
    String resolution;
    @JSONField(name = "Status")
    String status;
    @JSONField(name = "AddList")
    ModifyList addList;
    @JSONField(name = "DelList")
    ModifyList delList;

    @Data
    public static class ModifyList {
        @JSONField(name = "Devices")
        Map<String, List<common.Channel>> devices;
        @JSONField(name = "MainStreams")
        List<String> mainStreams;
        @Deprecated
        @JSONField(name = "Streams")
        List<String> streams;
    }
}
