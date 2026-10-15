package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CloudEditTask {
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "Status")
    Integer Status;
    @JSONField(name = "SourceVideoList")
    List<HighlightClipSourceVideo> SourceVideoList;
}
