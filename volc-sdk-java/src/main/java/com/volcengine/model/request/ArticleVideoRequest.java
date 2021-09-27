package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ArticleVideoRequest {
    @JSONField(name = "GroupId")
    Long groupId;
    @JSONField(name = "Vid")
    String vid;
}
