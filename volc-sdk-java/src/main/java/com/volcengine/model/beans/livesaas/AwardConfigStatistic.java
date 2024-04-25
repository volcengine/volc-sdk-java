package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class AwardConfigStatistic {
    @JSONField(name = "SendTime")
    Long SendTime;
    @JSONField(name = "OpenAwardTime")
    Long OpenAwardTime;
    @JSONField(name = "DeadLine")
    Long DeadLine;
    @JSONField(name = "BarragePwd")
    String BarragePwd;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "RangeStatus")
    Byte RangeStatus;
    @JSONField(name = "MsgIds")
    String MsgIds;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "ShowWinnerComment")
    Byte ShowWinnerComment;
    @JSONField(name = "Status")
    Byte Status;
    @JSONField(name = "AwardType")
    Byte AwardType;
    @JSONField(name = "AwardNum")
    Long AwardNum;
    @JSONField(name = "ShowPeopleNumber")
    Byte ShowPeopleNumber;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "AwardCondition")
    AwardCondition AwardCondition;
    @JSONField(name = "AwardTheme")
    String AwardTheme;
    @JSONField(name = "ParticipantCount")
    Long ParticipantCount;
    @JSONField(name = "WinnerCount")
    Long WinnerCount;
    @JSONField(name = "AwardItemInfo")
    List<AwardItemInfo> AwardItemInfo;
    @JSONField(name = "IsHideAwardNum")
    Integer IsHideAwardNum;
}
