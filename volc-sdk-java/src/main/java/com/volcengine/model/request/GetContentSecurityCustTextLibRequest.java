package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetContentSecurityCustTextLibRequest {
    @JSONField(name = "app_id")
    Integer appId;
    @JSONField(name = "service")
    String service;
    @JSONField(name = "name")
    String name;
    @JSONField(name = "keyword")
    String keyword;
    @JSONField(name = "page_num")
    Integer pageNum;
    @JSONField(name = "page_size")
    Integer pageSize;
}
