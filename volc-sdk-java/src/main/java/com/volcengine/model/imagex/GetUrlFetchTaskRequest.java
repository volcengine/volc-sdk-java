package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetUrlFetchTaskRequest {
    @JSONField(name = "Id")
    String id;
}
