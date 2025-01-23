package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class LoopVideoListResp {
    @JSONField(name = "Index")
    Long Index;
    @JSONField(name = "VideoCoverImage")
    String VideoCoverImage;
    @JSONField(name = "VideoName")
    String VideoName;
    @JSONField(name = "VideoVid")
    String VideoVid;
    @JSONField(name = "ReviewStatus")
    Integer ReviewStatus;
    @JSONField(name = "Offset")
    Long Offset;
    @JSONField(name = "MediaSize")
    Long MediaSize;
    @JSONField(name = "WarmupStatus")
    Integer WarmupStatus;
    @JSONField(name = "WarmupProgress")
    Integer WarmupProgress;
    @JSONField(name = "MediaDuration")
    Integer MediaDuration;
    @JSONField(name = "InteractionScriptEnabled")
    Boolean InteractionScriptEnabled;
    @JSONField(name = "InteractionScriptId")
    Long InteractionScriptId;
}
