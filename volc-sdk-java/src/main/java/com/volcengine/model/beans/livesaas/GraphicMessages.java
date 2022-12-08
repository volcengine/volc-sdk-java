package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GraphicMessages  {
    @JSONField(name = "IsDelete")
    Boolean IsDelete;
    @JSONField(name = "CreateTime")
    Long CreateTime;
    @JSONField(name = "GraphicMessageId")
    Long GraphicMessageId;
    @JSONField(name = "Context")
    List<GraphicMessageContext> Context;
}