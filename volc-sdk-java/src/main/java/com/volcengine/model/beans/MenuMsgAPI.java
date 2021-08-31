package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MenuMsgAPI {
   @JSONField(name = "Name")
   String Name;
   @JSONField(name = "Type")
   Integer Type;
   @JSONField(name = "Location")
   Integer Location;
}
