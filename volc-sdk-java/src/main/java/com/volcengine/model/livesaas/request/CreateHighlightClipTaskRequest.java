package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.HighlightClipConfig;
import lombok.Data;

@Data
public class CreateHighlightClipTaskRequest {
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "Scene")
    Integer Scene;
    @JSONField(name = "Title")
    String Title;
    @JSONField(name = "UserPrompt")
    String UserPrompt;
    @JSONField(name = "CoverImage")
    String CoverImage;
    @JSONField(name = "HighlightClipConfig")
    HighlightClipConfig HighlightClipConfig;
}
