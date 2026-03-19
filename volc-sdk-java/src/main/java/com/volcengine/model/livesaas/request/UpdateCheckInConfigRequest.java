package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateCheckInConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "CheckInId")
    String CheckInId;
    @JSONField(name = "CheckInName")
    String CheckInName;
    @JSONField(name = "Deadline")
    Long Deadline;
    @JSONField(name = "DeadlineSecond")
    Integer DeadlineSecond;
    @JSONField(name = "SendType")
    Integer SendType;
    @JSONField(name = "AutoSendTime")
    Long AutoSendTime;
    @JSONField(name = "NeedPersonInfo")
    Integer NeedPersonInfo;
    @JSONField(name = "CheckInInfo")
    String CheckInInfo;
    @JSONField(name = "IsSendComment")
    Integer IsSendComment;
    @JSONField(name = "CommentContent")
    String CommentContent;
    @JSONField(name = "CannotWatchLiveWhenNotCheckIn")
    Integer CannotWatchLiveWhenNotCheckIn;
    @JSONField(name = "CannotWatchLivePrompt")
    String CannotWatchLivePrompt;
}
