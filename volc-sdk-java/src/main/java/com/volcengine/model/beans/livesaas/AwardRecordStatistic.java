package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AwardRecordStatistic {
    @JSONField(name = "Ip")
    String Ip;
    @JSONField(name = "UserId")
    String UserId;
    @JSONField(name = "LoginTel")
    String LoginTel;
    @JSONField(name = "ExternalId")
    String ExternalId;
    @JSONField(name = "Extra")
    String Extra;
    @JSONField(name = "UserAgent")
    String UserAgent;
    @JSONField(name = "AwardId")
    Long AwardId;
    @JSONField(name = "AwardAddress")
    String AwardAddress;
    @JSONField(name = "NotifyResult")
    Byte NotifyResult;
    @JSONField(name = "OpenAwardTime")
    Long OpenAwardTime;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "AwardResult")
    Long AwardResult;
    @JSONField(name = "AwardName")
    String AwardName;
    @JSONField(name = "Email")
    String Email;
    @JSONField(name = "UserName")
    String UserName;
    @JSONField(name = "ReceiverName")
    String ReceiverName;
    @JSONField(name = "ReceiverTel")
    String ReceiverTel;
    @JSONField(name = "IsPriorityUser")
    Integer IsPriorityUser;
    @JSONField(name = "AwardItemName")
    String AwardItemName;
    @JSONField(name = "AwardEmail")
    String AwardEmail;
}
