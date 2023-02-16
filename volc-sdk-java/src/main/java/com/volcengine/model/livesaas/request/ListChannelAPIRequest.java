package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class ListChannelAPIRequest {
    @JSONField(name = "PageItemCount")
    Integer PageItemCount;
    @JSONField(name = "Content")
    String Content;
    @JSONField(name = "AccountId")
    Long AccountId;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "PageNo")
    Integer PageNo;
}