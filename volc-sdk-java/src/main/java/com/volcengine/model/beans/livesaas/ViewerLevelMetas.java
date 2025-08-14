package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ViewerLevelMetas {
    @JSONField(name = "LevelId")
    java.lang.Long LevelId;
    @JSONField(name = "LevelOrder")
    java.lang.Integer LevelOrder;
    @JSONField(name = "LevelName")
    java.lang.String LevelName;
    @JSONField(name = "Color")
    java.lang.String Color;
    @JSONField(name = "LevelIcon")
    java.lang.String LevelIcon;
    @JSONField(name = "Description")
    java.lang.String Description;
}