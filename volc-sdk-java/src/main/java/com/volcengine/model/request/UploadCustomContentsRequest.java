package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UploadCustomContentsRequest {
    @JSONField(name = "app_id")
    Integer appId;
    @JSONField(name = "name")
    String name;
    @JSONField(name = "contents")
    List<String> contents;
    @JSONField(name = "modify_type")
    int modify_type;
}
