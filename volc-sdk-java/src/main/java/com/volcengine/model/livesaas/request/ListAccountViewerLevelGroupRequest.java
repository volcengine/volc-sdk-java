package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListAccountViewerLevelGroupRequest {    
    @JSONField(name = "PageNo")
    Integer PageNo;
    
    @JSONField(name = "PageSize")
    Integer PageSize;
    
    @JSONField(name = "SearchGroupName")
    String SearchGroupName;
}