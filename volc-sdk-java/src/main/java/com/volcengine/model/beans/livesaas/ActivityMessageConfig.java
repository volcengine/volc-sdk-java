package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ActivityMessageConfig {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "IsEntryMessageEnable")
    Integer IsEntryMessageEnable;
    @JSONField(name = "IsGiftMessageEnable")
    Integer IsGiftMessageEnable;
    @JSONField(name = "IsLotteryMessageEnable")
    Integer IsLotteryMessageEnable;
    @JSONField(name = "IsRedPacketMessageEnable")
    Integer IsRedPacketMessageEnable;
    @JSONField(name = "IsDynamicEmojiMessageEnable")
    Integer IsDynamicEmojiMessageEnable;
    @JSONField(name = "IsCustomMessageEnable")
    Integer IsCustomMessageEnable;
}
