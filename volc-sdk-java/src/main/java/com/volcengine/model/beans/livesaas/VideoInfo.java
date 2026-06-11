package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VideoInfo {
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "VideoURL")
    String VideoURL;
    @JSONField(name = "VideoName")
    String VideoName;
    @JSONField(name = "SourceType")
    Integer SourceType;
    @JSONField(name = "SourceTaskId")
    Long SourceTaskId;
}
