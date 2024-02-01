package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageTranscodeDetailsRespExecInfoExecInput {
    @JSONField(name = "Image")
    String image;

    @JSONField(name = "Template")
    String template;
}
