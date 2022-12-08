package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActMediaForm;
import lombok.Data;

@Data
public class UploadMediaRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Media")
    ActMediaForm Media;
}