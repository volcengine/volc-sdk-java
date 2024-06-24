package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class TeachAssistantAccountReq {
    @JSONField(name = "Title")
    String Title;
    @JSONField(name = "NickName")
    String NickName;
    @JSONField(name = "Password")
    String Password;
    @JSONField(name = "IdentityId")
    String IdentityId;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "TeachAssistantFeatures")
    List<Integer> TeachAssistantFeatures;
    @JSONField(name = "AudienceGroupIds")
    List<Long> AudienceGroupIds;
}