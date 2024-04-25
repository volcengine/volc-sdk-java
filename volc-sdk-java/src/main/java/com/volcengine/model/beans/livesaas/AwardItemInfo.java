package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AwardItemInfo {
    @JSONField(name = "AwardItemId")
    Long AwardItemId;
    @JSONField(name = "AwardItemName")
    String AwardItemName;
    @JSONField(name = "AwardItemCount")
    Long AwardItemCount;
    @JSONField(name = "AwardItemType")
    Integer AwardItemType;
    @JSONField(name = "WinnerCount")
    Long WinnerCount;
    @JSONField(name = "AwardItemIcon")
    String AwardItemIcon;
    @JSONField(name = "AwardLotteryTicketAddr")
    String AwardLotteryTicketAddr;
    @JSONField(name = "WinnerInfoType")
    String WinnerInfoType;
    @JSONField(name = "AwardItemNum")
    String AwardItemNum;
    @JSONField(name = "AwardItemAmounts")
    Long AwardItemAmounts;
}
