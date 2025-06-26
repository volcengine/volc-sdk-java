package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListProjectsRequest {
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "DisplayName")
    String DisplayName;
}