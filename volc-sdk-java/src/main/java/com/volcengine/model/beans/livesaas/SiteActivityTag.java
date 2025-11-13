package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SiteActivityTag  {
    @JSONField(name = "Index")
    Integer Index;
    @JSONField(name = "Value")
    java.lang.String Value;
    @JSONField(name = "Name")
    java.lang.String Name;
}
