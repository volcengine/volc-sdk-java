package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class AwardItem {
    @JSONField(name = "AwardItemIcon")
    String AwardItemIcon;
    @JSONField(name = "AwardItemType")
    Integer AwardItemType;
    @JSONField(name = "AwardItemName")
    String AwardItemName;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "AwardLotteryTicketAddr")
    String AwardLotteryTicketAddr;
    @JSONField(name = "AwardItemStock")
    Long AwardItemStock;
    @JSONField(name = "AwardItemNum")
    String AwardItemNum;
    @JSONField(name = "AwardItemAmounts")
    Long AwardItemAmounts;
    @JSONField(name = "DeliveryMethod")
    Integer DeliveryMethod;
    @JSONField(name = "WinnerInfoType")
    List<Integer> WinnerInfoType;
}
