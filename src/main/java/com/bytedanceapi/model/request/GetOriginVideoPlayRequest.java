package com.bytedanceapi.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetOriginVideoPlayRequest {
    @JSONField(name = "Vid")
    String vid;
    @JSONField(name = "Base64")
    Integer base64;
    @JSONField(name = "Ssl")
    Integer ssl;
}
