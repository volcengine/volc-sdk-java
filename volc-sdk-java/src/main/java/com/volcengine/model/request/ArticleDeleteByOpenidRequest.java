package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ArticleDeleteByOpenidRequest {
    @JSONField(name = "OpenId")
    String openId;
}
