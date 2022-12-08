package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetActivityAntidirtRequest {
    @JSONField(name = "PageNo")
    Integer PageNo;
    @JSONField(name = "PageItemCount")
    Integer PageItemCount;
    @JSONField(name = "Content")
    String Content;
    @JSONField(name = "ActivityId")
    Long ActivityId;
}