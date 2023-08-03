package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.video_aiot.common;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CreateRecordPlanRequest {
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
    @JSONField(name = "BindChannels")
    Map<String, common.Channel> bindChannel;
    @JSONField(name = "BindStreams")
    List<String> bindStreams;
    @JSONField(name = "Status")
    String status;
}
