package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GraphicMessageContext  {
    @JSONField(name = "GraphicMessageContext")
    java.lang.String GraphicMessageContext;
    @JSONField(name = "GraphicMessageType")
    Integer GraphicMessageType;
}