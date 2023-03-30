package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageXQueryAppsReq {
    @JSONField(name = "Source")
    private String source;
}
