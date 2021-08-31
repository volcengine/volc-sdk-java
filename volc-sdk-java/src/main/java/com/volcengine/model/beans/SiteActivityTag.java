package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SiteActivityTag {
    @JSONField(name = "Index")
    Integer Index;
    @JSONField(name = "Value")
    String Value;
    @JSONField(name = "DbIndex")
    Integer DbIndex;
    @JSONField(name = "Show")
    Integer Show;
    @JSONField(name = "Name")
    String Name;
}
