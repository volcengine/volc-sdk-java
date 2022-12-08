package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class LoopVideoList  {
    @JSONField(name = "Index")
    Long Index;
    @JSONField(name = "VideoCoverImage")
    java.lang.String VideoCoverImage;
    @JSONField(name = "VideoName")
    java.lang.String VideoName;
    @JSONField(name = "VideoVid")
    java.lang.String VideoVid;
}