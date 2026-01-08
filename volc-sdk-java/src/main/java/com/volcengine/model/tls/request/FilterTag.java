package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class FilterTag {
    @JSONField(name = "Key")
    private String key;
    
    @JSONField(name = "Values")
    private List<String> values;
}