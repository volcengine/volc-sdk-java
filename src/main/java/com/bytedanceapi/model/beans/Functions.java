package com.bytedanceapi.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Functions {
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "Input")
    Object input;
}
