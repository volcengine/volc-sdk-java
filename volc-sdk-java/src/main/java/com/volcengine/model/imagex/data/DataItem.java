package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public abstract class DataItem<T> {
    @JSONField(name = "Data")
    private List<TSItem<T>> data;
}

