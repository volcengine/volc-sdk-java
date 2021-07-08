package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VidInfo {
    @JSONField(name = "Vid")
     String    Vid;
    @JSONField(name = "name")
     String    Name;
}
