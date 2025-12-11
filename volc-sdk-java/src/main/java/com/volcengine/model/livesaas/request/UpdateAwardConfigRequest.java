package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AwardCondition;
import com.volcengine.model.beans.livesaas.AwardItemConfig;
import lombok.Data;

import java.util.List;

@Data
public class UpdateAwardConfigRequest {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "AwardType")
    Integer AwardType;
    @JSONField(name = "BarragePwd")
    String BarragePwd;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "RangeStatus")
    Integer RangeStatus;
    @JSONField(name = "ShowPeopleNumber")
    Integer ShowPeopleNumber;
    @JSONField(name = "Status")
    Integer Status;
    @JSONField(name = "ShowWinnerComment")
    Integer ShowWinnerComment;
    @JSONField(name = "AwardCondition")
    AwardCondition AwardCondition;
    @JSONField(name = "AwardTheme")
    String AwardTheme;
    @JSONField(name = "IsHideAwardNum")
    Integer IsHideAwardNum;
    @JSONField(name = "AwardItemConfigs")
    List<AwardItemConfig> AwardItemConfigs;
    @JSONField(name = "AwardSendType")
    Integer AwardSendType;
    @JSONField(name = "DeadLineSecond")
    Long DeadLineSecond;
    @JSONField(name = "BlackUserInfoId")
    Long BlackUserInfoId;
    @JSONField(name = "VipUserInfoId")
    Long VipUserInfoId;
}