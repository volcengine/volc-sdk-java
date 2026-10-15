package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListHighlightClipTasksRequest {
    @JSONField(name = "SearchName")
    String SearchName;
    @JSONField(name = "Status")
    Integer Status;
    @JSONField(name = "PageNo")
    Long PageNo;
    @JSONField(name = "PageItemCount")
    Long PageItemCount;
}
