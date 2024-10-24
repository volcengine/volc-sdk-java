package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AwardItem;
import lombok.Data;

@Data
public class UpdateAwardItemRequest {
    @JSONField(name = "AwardItem")
    AwardItem AwardItem;
}