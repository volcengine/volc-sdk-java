package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ProductExplainInfo {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "SendTime")
    Long SendTime;
    @JSONField(name = "Title")
    String Title;
    @JSONField(name = "CoverImage")
    String CoverImage;
    @JSONField(name = "Highlight")
    String Highlight;
    @JSONField(name = "ClickCount")
    Long ClickCount;
    @JSONField(name = "StrikeThrough")
    String StrikeThrough;
}
