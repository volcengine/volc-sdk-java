package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
@Data
public class MenuMsgNew {
    @JSONField(name = "ToolId")
    Long ToolId;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "Type")
    Integer Type;
}
