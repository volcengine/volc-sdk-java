package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ListActivityLibAPIRequest {
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "SearchType")
    Integer SearchType;
    @JSONField(name = "SourceType")
    Integer SourceType;
    @JSONField(name = "PageNum")
    Integer PageNum;
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "OrderKey")
    String OrderKey;
    @JSONField(name = "FolderId")
    Long FolderId;
    @JSONField(name = "IncludeSubFolder")
    Boolean IncludeSubFolder;
}