package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import lombok.Data;

@Data
public class OCRBankCardV1Response extends VisualBaseResponse {
    
    @JSONField(name = "data")
    BankData data;

    @Data
    public static class BankData {
        
        @JSONField(name = "card_number")
        String cardNumber;

        @JSONField(name = "card_corners")
        CornerInfo cardCorners;
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