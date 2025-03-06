package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListActivityRedPacketRequest {
    @JSONField(name = "ActivityID")
    Long ActivityID;

    @JSONField(name = "PageItemCount")
    Integer PageItemCount;

    @JSONField(name = "PageNo")
    Integer PageNo;
}
