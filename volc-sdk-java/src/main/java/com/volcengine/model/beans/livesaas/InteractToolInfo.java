package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class InteractToolInfo {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "SendTime")
    Long SendTime;
    @JSONField(name = "Title")
    String Title;
    @JSONField(name = "CoverImage")
    String CoverImage;
    @JSONField(name = "TotalCount")
    Long TotalCount;
    @JSONField(name = "JoinCount")
    Long JoinCount;
    @JSONField(name = "WinCount")
    Long WinCount;
    @JSONField(name = "Type")
    Integer Type;
}
