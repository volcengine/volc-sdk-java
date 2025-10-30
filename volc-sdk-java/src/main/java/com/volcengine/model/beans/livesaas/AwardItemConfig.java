package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AwardItemConfig {
    @JSONField(name = "AwardId")
    Long AwardId;
    @JSONField(name = "AwardItemCount")
    Long AwardItemCount;
}