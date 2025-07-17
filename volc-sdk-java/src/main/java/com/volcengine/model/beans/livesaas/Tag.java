package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class Tag {
    @JSONField(name = "TagId")
    Long TagId;
    @JSONField(name = "TagName")
    String TagName;
    @JSONField(name = "ParentTagId")
    Long ParentTagId;
    @JSONField(name = "ParentTagName")
    String ParentTagName;
}
