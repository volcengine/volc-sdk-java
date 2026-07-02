package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.VideoSummaryParagraph;
import lombok.Data;

import java.util.List;

@Data
public class UpdateVideoAISummaryRequest {
    @JSONField(name = "Vid")
    String Vid;

    @JSONField(name = "ActivityId")
    Long ActivityId;

    @JSONField(name = "SummaryContent")
    String SummaryContent;

    @JSONField(name = "SummaryContentEn")
    String SummaryContentEn;

    @JSONField(name = "ParagraphContents")
    List<VideoSummaryParagraph> ParagraphContents;

    @JSONField(name = "NeedPublish")
    Boolean NeedPublish;
}
