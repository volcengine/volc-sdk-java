package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageXQueryRegionsReq {
    @JSONField(name = "Source")
    private String source;
    @JSONField(name = "Appid")
    private String appid;
    @JSONField(name = "OS")
    private String os;
}
