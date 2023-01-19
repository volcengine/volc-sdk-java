package com.volcengine.service.live.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateVQScoreTaskRequest {

    @JSONField(name = "MainAddr")
    private String MainAddr;

    @JSONField(name = "ContrastAddr")
    private String ContrastAddr;

    @JSONField(name = "FrameInterval")
    private long FrameInterval;

    @JSONField(name = "Duration")
    private long Duration;

    @JSONField(name = "Algorithm")
    private String Algorithm;
}
