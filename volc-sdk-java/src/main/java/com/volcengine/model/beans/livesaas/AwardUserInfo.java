package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AwardUserInfo {
    @JSONField(name = "UserId")
    String UserId;
    @JSONField(name = "UserName")
    String UserName;
    @JSONField(name = "UserTel")
    String UserTel;
}
