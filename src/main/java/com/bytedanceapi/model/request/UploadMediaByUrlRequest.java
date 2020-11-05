package com.bytedanceapi.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UploadMediaByUrlRequest {
    @JSONField(name = "SpaceName")
    String spaceName;
    @JSONField(name = "Format")
    String format;
    @JSONField(name = "SourceUrls")
    List<String> sourceUrls;
    @JSONField(name = "CallbackArgs")
    String callbackArgs;
}
