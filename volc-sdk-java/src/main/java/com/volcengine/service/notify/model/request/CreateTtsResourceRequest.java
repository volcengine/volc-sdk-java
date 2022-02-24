package com.volcengine.service.notify.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CreateTtsResourceRequest {

    @JSONField(name = "Name")
    private String name;

    @JSONField(name = "TtsTemplateContent")
    private String ttsTemplateContent;

    @JSONField(name = "Remark")
    private String remark;
}
