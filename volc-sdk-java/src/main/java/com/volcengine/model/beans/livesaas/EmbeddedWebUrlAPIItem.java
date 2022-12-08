package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class EmbeddedWebUrlAPIItem  {
    @JSONField(name = "PCUrl")
    java.lang.String PCUrl;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "MobileUrl")
    java.lang.String MobileUrl;
}