package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VideoTaskItem {
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "Url")
    String Url;
    @JSONField(name = "SourceTaskId")
    Long SourceTaskId;
    @JSONField(name = "VideoName")
    String VideoName;
}
