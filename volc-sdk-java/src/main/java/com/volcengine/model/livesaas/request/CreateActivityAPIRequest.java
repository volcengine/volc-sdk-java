package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateActivityAPIRequest {
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "LiveTime")
    Long liveTime;
    @JSONField(name = "ViewUrlPath")
    String viewUrlPath;
    @JSONField(name = "CoverImage")
    String coverImage;
    @JSONField(name = "OldId")
    String oldId;
    @JSONField(name = "CopyStream")
    Boolean copyStream;
}
