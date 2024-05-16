package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
@Data
public class ListAppsRequest {
    @JSONField(name = "Limit")
    Integer limit;
    @JSONField(name = "Offset")
    Integer offset;
}
