package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteContentSecurityCustImgLibRequest {
    @JSONField(name = "app_id")
    Integer appId;
    @JSONField(name = "service")
    String service;
    @JSONField(name = "name")
    String name;
    @JSONField(name = "data")
    List<String> data;
}
