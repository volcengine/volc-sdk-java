package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class URLSet  {
    @JSONField(name = "SourceUrl")
    java.lang.String SourceUrl;
    @JSONField(name = "Name")
    java.lang.String Name;
    @JSONField(name = "FolderId")
    Long FolderId;
}