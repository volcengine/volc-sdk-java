package com.bytedanceapi.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetPlayInfoRequest {
    @JSONField(name = "video_id")
    String videoId;
    @JSONField(name = "format_type")
    String formatType;
    @JSONField(name = "codec_type")
    Integer codecType;
    @JSONField(name = "definition")
    String definition;
    @JSONField(name = "stream_type")
    String streamType;
    String watermark;
    String ptoken;
    @JSONField(name = "cdn_type")
    Integer cdnType;
    Integer base64;
    Integer ssl;
}
