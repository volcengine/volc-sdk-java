package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CheckInConfig {
    @JSONField(name = "CheckInId")
    String CheckInId;
    @JSONField(name = "CheckInName")
    String CheckInName;
    @JSONField(name = "CheckInCount")
    Long CheckInCount;
    @JSONField(name = "Deadline")
    Long Deadline;
    @JSONField(name = "Status")
    String Status;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "AccountId")
    Long AccountId;
    @JSONField(name = "NeedPersonInfo")
    Integer NeedPersonInfo;
    @JSONField(name = "OpenCheckTime")
    Long OpenCheckTime;
    @JSONField(name = "FollowerUserName")
    String FollowerUserName;
    @JSONField(name = "CheckInInfo")
    String CheckInInfo;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "IsSendComment")
    Integer IsSendComment;
    @JSONField(name = "CommentContent")
    String CommentContent;
    @JSONField(name = "DeadlineSecond")
    Integer DeadlineSecond;
    @JSONField(name = "CannotWatchLiveWhenNotCheckIn")
    Integer CannotWatchLiveWhenNotCheckIn;
    @JSONField(name = "SendType")
    Integer SendType;
    @JSONField(name = "AutoSendTime")
    Long AutoSendTime;
    @JSONField(name = "CannotWatchLivePrompt")
    String CannotWatchLivePrompt;
}
