package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateViewerLevelConfigRequest {
    // 添加直播间敏感词内容
    @JSONField(name = "ViewerLevelConfigs")
    List<ViewerLevelConfigs> ViewerLevelConfigs;
    @Data
    public static class ViewerLevelConfigs {
        @JSONField(name = "LevelName")
        String LevelName;
        @JSONField(name = "Description")
        String Description;
        @JSONField(name = "Color")
        String Color;
        @JSONField(name = "LevelIcon")
        String LevelIcon;
    }
}