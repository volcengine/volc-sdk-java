package com.volcengine.service.notify.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UploadVoiceResourceRequest {

    /**
     * fileName
     */
    @JSONField(name = "FileName")
    private String fileName;
}
