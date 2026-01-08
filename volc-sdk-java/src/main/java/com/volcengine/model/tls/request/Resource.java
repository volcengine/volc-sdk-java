package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Resource {

    /** 资源属性列表. */
    @JSONField(name = "Attributes")
    private List<KeyValue> attributes;
}
