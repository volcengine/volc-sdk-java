package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ExtraDim {
    @JSONField(name = "Dim")
    private String dim;
    @JSONField(name = "Vals")
    private List<String> vals;
}
