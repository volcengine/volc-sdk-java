package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivityBonusTaskWinners {
    @JSONField(name = "UserId")
    Long UserId;

    @JSONField(name = "ExternalUserId")
    String ExternalUserId;

    @JSONField(name = "NickName")
    String NickName;

    @JSONField(name = "FinishTime")
    Long FinishTime;

    @JSONField(name = "Tel")
    String Tel;

    @JSONField(name = "Email")
    String Email;

    @JSONField(name = "AwardTel")
    String AwardTel;

    @JSONField(name = "AwardAddress")
    String AwardAddress;

    @JSONField(name = "ReceiverName")
    String ReceiverName;

    @JSONField(name = "AwardEmail")
    String AwardEmail;

    @JSONField(name = "BonusIndex")
    Integer BonusIndex;

    @JSONField(name = "BonusDetail")
    BonusObject BonusDetail;
}

