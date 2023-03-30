package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SensibleRamItem {
    @JSONField(name = "ActivityViewTree")
    private String activityViewTree;
    @JSONField(name = "Count")
    private Long count;
    @JSONField(name = "RamSize")
    private Long ramSize;
    @JSONField(name = "URL")
    private String uRL;
    @JSONField(name = "BizTag")
    private String bizTag;
}
