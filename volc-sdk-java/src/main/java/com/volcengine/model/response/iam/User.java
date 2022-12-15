package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class User {
    @JSONField(name = "CreateDate")
    String createDate;
    @JSONField(name = "UpdateDate")
    String updateDate;
    @JSONField(name = "AccountId")
    Long accountID;
    @JSONField(name = "UserName")
    String userName;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "DisplayName")
    String displayName;
    @JSONField(name = "Email")
    String email;
    @JSONField(name = "EmailIsVerify")
    Boolean emailIsVerify;
    @JSONField(name = "MobilePhone")
    String mobilePhone;
    @JSONField(name = "MobilePhoneIsVerify")
    Boolean mobilePhoneIsVerify;
    @JSONField(name = "Trn")
    String trn;
    @JSONField(name = "ThirdPartyIdentity")
    String thirdPartyIdentity;
}
