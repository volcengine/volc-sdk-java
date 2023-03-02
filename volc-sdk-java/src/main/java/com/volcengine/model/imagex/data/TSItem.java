package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class TSItem<T> {
    @JSONField(name = "TimeStamp")
    private String timeStamp;

    @JSONField(name = "Value")
    private T value;
}

