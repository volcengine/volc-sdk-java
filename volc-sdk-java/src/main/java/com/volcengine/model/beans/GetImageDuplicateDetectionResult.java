package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetImageDuplicateDetectionResult {
    @JSONField(name = "Score")
    private String score;

    @JSONField(name = "Groups")
    private Map<String, List<String>> groups;
}
