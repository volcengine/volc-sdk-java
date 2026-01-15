package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AddWxMiniAppFileRequest {
    @JSONField(name = "FileName")
    String FileName;
    @JSONField(name = "Content")
    String Content;
}

