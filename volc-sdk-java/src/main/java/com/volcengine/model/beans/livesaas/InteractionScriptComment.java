package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class InteractionScriptComment {
    @JSONField(name = "Id")
    Integer Id;
    @JSONField(name = "SendTime")
    Integer SendTime;
    @JSONField(name = "Role")
    Integer Role;
    @JSONField(name = "Nickname")
    String Nickname;
    @JSONField(name = "Content")
    String Content;
}
