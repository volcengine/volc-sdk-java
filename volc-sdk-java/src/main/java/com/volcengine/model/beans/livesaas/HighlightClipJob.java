package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class HighlightClipJob {
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "CoverImage")
    String CoverImage;
    @JSONField(name = "Title")
    String Title;
    @JSONField(name = "Status")
    Integer Status;
    @JSONField(name = "CreateTime")
    Long CreateTime;
}
