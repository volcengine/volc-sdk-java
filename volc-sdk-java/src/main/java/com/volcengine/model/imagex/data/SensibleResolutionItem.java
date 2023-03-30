package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SensibleResolutionItem {
    @JSONField(name = "ActivityViewTree")
    private String activityViewTree;
    @JSONField(name = "Count")
    private Long count;
    @JSONField(name = "URL")
    private String uRL;
    @JSONField(name = "BizTag")
    private String bizTag;
    @JSONField(name = "ImageHeight")
    private Long imageHeight;
    @JSONField(name = "ImageWidth")
    private Long imageWidth;
    @JSONField(name = "ViewHeight")
    private Long viewHeight;
    @JSONField(name = "ViewWidth")
    private Long viewWidth;
}
