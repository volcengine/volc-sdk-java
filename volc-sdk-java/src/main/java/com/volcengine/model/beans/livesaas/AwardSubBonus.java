package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class AwardSubBonus {
    @JSONField(name = "AwardItemId")
    Long AwardItemId;

    @JSONField(name = "AwardItemIcon")
    String AwardItemIcon;

    @JSONField(name = "AwardItemName")
    String AwardItemName;

    @JSONField(name = "AwardItemType")
    Integer AwardItemType;

    @JSONField(name = "AwardItemAmounts")
    Long AwardItemAmounts;

    @JSONField(name = "AwardLotteryTicketAddr")
    String AwardLotteryTicketAddr;

    @JSONField(name = "DeliveryMethod")
    Integer DeliveryMethod;

    @JSONField(name = "WinnerInfoType")
    List<Integer> WinnerInfoType;

    @JSONField(name = "AwardItemNum")
    String AwardItemNum;

    @JSONField(name = "LimitCount")
    Long LimitCount;
}

