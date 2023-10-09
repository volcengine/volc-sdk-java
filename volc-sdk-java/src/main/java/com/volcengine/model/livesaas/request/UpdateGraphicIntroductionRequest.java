package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.GraphicIntroduction;
import lombok.Data;


@Data
public class UpdateGraphicIntroductionRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "GraphicIntroduction")
    GraphicIntroduction GraphicIntroduction;
    @JSONField(name = "VerticalIconUrl")
    String VerticalIconUrl;
}