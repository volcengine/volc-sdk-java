package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VideoSummaryParagraph {
    @JSONField(name = "StartTime")
    Long StartTime;

    @JSONField(name = "EndTime")
    Long EndTime;

    @JSONField(name = "Title")
    String Title;

    @JSONField(name = "Content")
    String Content;

    @JSONField(name = "TitleEn")
    String TitleEn;

    @JSONField(name = "ContentEn")
    String ContentEn;
}
