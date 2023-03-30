package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CurveIntItem {
    @JSONField(name = "Type")
    private String type;
    @JSONField(name = "Count")
    private Long count;
    @JSONField(name = "Data")
    private List<CurveDataIntItem> data;
}
