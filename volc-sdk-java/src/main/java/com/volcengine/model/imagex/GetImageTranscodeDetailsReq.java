package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageTranscodeDetailsReq {
    @JSONField(name = "QueueId")
    String queueId;

    @JSONField(name = "StartTime")
    Integer startTime;

    @JSONField(name = "EndTime")
    Integer endTime;

    @JSONField(name = "Status")
    String status;

    @JSONField(name = "SearchPtn")
    String searchPtn;

    @JSONField(name = "Limit")
    Integer limit;

    @JSONField(name = "Offset")
    Integer offset;
}
