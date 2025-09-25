package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ViewerConfigGroupMeta {
    @JSONField(name = "ViewerLevelGroupId")
    Long ViewerLevelGroupId;
    
    @JSONField(name = "LevelConfigNums")
    Integer LevelConfigNums;
    
    @JSONField(name = "GroupName")
    String GroupName;
    
    @JSONField(name = "GroupDescription")
    String GroupDescription;
    
    @JSONField(name = "EditEnable")
    Integer EditEnable;
    
    @JSONField(name = "GroupType")
    Integer GroupType;
}