package com.volcengine.service.vms.request;

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

    @JSONField(name = "ReqSourceType")
    private Integer reqSourceType=3;
}
