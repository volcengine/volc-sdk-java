package com.bytedanceapi.model.sts2;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class Statement {
    @JSONField(name = "Effect", ordinal = 1)
    private String effect;
    @JSONField(name = "Action", ordinal = 2)
    private List<String> action;
    @JSONField(name = "Resource", ordinal = 3)
    private List<String> resource;
    @JSONField(name = "Condition", ordinal = 4)
    private String condition;
}
