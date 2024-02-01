package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class MirrorHttpCodeRespItem {
    @JSONField(name = "Domain")
    private String domain;
    @JSONField(name = "Count")
    private Long count;
    @JSONField(name = "Details")
    private List<MirrorHttpCodeDetailsItem> details;
}
