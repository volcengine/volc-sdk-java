package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ContentSegmentItem {
    @JSONField(name = "SegmentId")
    Long SegmentId;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "Content")
    String Content;
    @JSONField(name = "Tags")
    List<String> Tags;
    @JSONField(name = "HotWords")
    List<HotWord> HotWords;
    @JSONField(name = "Suggestion")
    String Suggestion;
    @JSONField(name = "Labels")
    List<Integer> Labels;
    @JSONField(name = "RelativeStartTime")
    Long RelativeStartTime;
    @JSONField(name = "RelativeEndTime")
    Long RelativeEndTime;
    @JSONField(name = "AiStatus")
    Integer AiStatus;
    @JSONField(name = "Title")
    String Title;

    @Data
    public static class HotWord {
        @JSONField(name = "Word")
        String Word;
        @JSONField(name = "Count")
        Long Count;
    }
}
