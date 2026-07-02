package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VideoAISummaryProgress {
    @JSONField(name = "Status")
    Integer Status;

    @JSONField(name = "SummaryStatus")
    Integer SummaryStatus;

    @JSONField(name = "ParagraphStatus")
    Integer ParagraphStatus;

    @JSONField(name = "JobStartTime")
    Long JobStartTime;
}
