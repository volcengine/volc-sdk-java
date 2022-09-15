package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import lombok.Data;

@Data
public class OCRBankCardV2Response extends VisualBaseResponse {
    
    @JSONField(name = "data")
    BankDataV2 data;

    @Data
    public static class BankDataV2 {
        
        @JSONField(name = "expired_date")
        String expiredDate;

        @JSONField(name = "expired_date_corners")
        CornerInfo expiredDateCorners;

        @JSONField(name = "number")
        String number;

        @JSONField(name = "number_corners")
        CornerInfo numberCorners;

        @JSONField(name = "bank_id")
        String bankId;

        @JSONField(name = "bank_name")
        String bankName;

        @JSONField(name = "card_name")
        String cardName;
    }

    @Data
    public static class CornerInfo {
        @JSONField(name = "left_top")
        List<Integer> leftTop;

        @JSONField(name = "right_top")
        List<Integer> rightTop;

        @JSONField(name = "right_bottom")
        List<Integer> rightBottom;

        @JSONField(name = "left_bottom")
        List<Integer> leftBottom;
    }
}