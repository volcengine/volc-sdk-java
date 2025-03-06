package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AwardUserInfo;
import lombok.Data;
import java.util.List;

@Data
public class CreateVipOrBlackListUserInfoRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "AwardUserInfoList")
    List<AwardUserInfo> AwardUserInfoList;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "Role")
    Integer Role;
}
