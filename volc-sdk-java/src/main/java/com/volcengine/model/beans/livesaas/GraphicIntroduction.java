package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GraphicIntroduction {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "Text")
    String Text;
    @JSONField(name = "MenuName")
    String MenuName;
}
