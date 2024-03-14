package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class WatermarkConfig {
    @JSONField(name = "Content")
    String Content;
    @JSONField(name = "FontSize")
    Integer FontSize;
    @JSONField(name = "FontColor")
    String FontColor;
    @JSONField(name = "Opacity")
    Integer Opacity;
    @JSONField(name = "Angle")
    Integer Angle;
}
