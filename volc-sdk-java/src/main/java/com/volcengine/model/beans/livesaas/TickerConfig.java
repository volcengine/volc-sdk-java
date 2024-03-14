package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class TickerConfig {
    @JSONField(name = "Content")
    String Content;
    @JSONField(name = "DisplayType")
    Integer DisplayType;
    @JSONField(name = "TickerSpeed")
    String TickerSpeed;
    @JSONField(name = "FontSize")
    Integer FontSize;
    @JSONField(name = "FontColor")
    String FontColor;
    @JSONField(name = "Opacity")
    Integer Opacity;
}
