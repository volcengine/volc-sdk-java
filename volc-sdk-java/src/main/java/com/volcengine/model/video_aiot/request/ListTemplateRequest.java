package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListTemplateRequest {
    @JSONField(name = "PageNumber")
    int pageNumber;
    @JSONField(name = "PageSize")
    int pageSize;
    @JSONField(name = "Order")
    String order;//  不填倒序，支持1/-1，-1为倒序
}
