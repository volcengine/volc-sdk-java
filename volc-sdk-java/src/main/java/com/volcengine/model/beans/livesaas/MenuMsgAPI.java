package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MenuMsgAPI  {
    @JSONField(name = "Name")
    java.lang.String Name;
    @JSONField(name = "Type")
    Integer Type;
    @JSONField(name = "Location")
    Integer Location;
}