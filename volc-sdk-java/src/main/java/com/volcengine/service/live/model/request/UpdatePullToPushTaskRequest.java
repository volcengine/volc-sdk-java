package com.volcengine.service.live.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdatePullToPushTaskRequest {

    @JSONField(name = "Title")
    private String Title;

    @JSONField(name = "TaskId")
    private String TaskId;

    @JSONField(name = "StartTime")
    private long StartTime;

    @JSONField(name = "EndTime")
    private long EndTime;

    @JSONField(name = "CallbackURL")
    private String CallbackURL;

    @JSONField(name = "Type")
    private int Type;

    @JSONField(name = "CycleMode")
    private int CycleMode;

    @JSONField(name = "DstAddr")
    private String DstAddr;

    @JSONField(name = "SrcAddr")
    private String SrcAddr;

    @JSONField(name = "SrcAddrS")
    private String[] SrcAddrS;

}
