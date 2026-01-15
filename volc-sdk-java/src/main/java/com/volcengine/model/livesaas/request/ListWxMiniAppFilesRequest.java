package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListWxMiniAppFilesRequest {
    @JSONField(name = "FileName")
    String FileName;
    @JSONField(name = "Status")
    Integer Status;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
}

