package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class WxMiniAppFile {
    @JSONField(name = "FileName")
    String FileName;
    @JSONField(name = "Content")
    String Content;
    @JSONField(name = "Status")
    Integer Status;
    @JSONField(name = "CreateTime")
    Long CreateTime;
    @JSONField(name = "UpdateTime")
    Long UpdateTime;
}

