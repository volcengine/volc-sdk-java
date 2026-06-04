package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class HighlightInfo {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "Type")
    Integer Type;
    @JSONField(name = "Reason")
    String Reason;
    @JSONField(name = "FrameImages")
    List<String> FrameImages;
    @JSONField(name = "AISummary")
    String AISummary;
    @JSONField(name = "Items")
    List<HighlightDetailItem> Items;
    @JSONField(name = "Title")
    String Title;
    @JSONField(name = "Vid")
    String Vid;

    @Data
    public static class HighlightDetailItem {
        @JSONField(name = "Title")
        String Title;
        @JSONField(name = "Trend")
        Integer Trend;
        @JSONField(name = "Description")
        String Description;
    }
}
