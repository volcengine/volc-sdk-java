package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ArticleDeleteResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
}
