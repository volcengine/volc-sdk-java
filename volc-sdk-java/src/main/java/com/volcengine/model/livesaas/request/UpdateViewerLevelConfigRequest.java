package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateViewerLevelConfigRequest {
    // 添加直播间敏感词内容
    @JSONField(name = "UpdateLevelUnits")
    List<UpdateViewerLevelConfigRequest.UpdateLevelUnits> UpdateLevelUnits;

    @Data
    public static class UpdateLevelUnits {
        @JSONField(name = "LevelId")
        Long LevelId;
        @JSONField(name = "ViewerLevelConfigs")
        UpdateViewerLevelConfigRequest.ViewerLevelConfigs ViewerLevelConfigs;
    }

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