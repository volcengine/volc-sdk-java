package com.bytedanceapi.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetRedirectPlayRequest {
    @JSONField(name = "Vid")
    String vid;
    @JSONField(name = "Definition")
    String definition;
    @JSONField(name = "Watermark")
    String watermark;
    @JSONField(name = "X-Amz-Expires")
    Integer expires;
}
