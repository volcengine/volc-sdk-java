package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.HighlightClipVideo;
import lombok.Data;

import java.util.List;

@Data
public class UpdateHighlightClipResultRequest {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "Title")
    String Title;
    @JSONField(name = "CoverImage")
    String CoverImage;
    @JSONField(name = "HighlightClipVideoList")
    List<HighlightClipVideo> HighlightClipVideoList;
}
