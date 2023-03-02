package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CompressDataItem {
    @JSONField(name = "InSize")
    private List<TSFloatItem> inSize;
    @JSONField(name = "OutSize")
    private List<TSFloatItem> outSize;
}
