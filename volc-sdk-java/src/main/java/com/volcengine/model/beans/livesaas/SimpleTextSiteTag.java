package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SimpleTextSiteTag  {
    @JSONField(name = "Index")
    Integer Index;
    @JSONField(name = "Name")
    java.lang.String Name;
}