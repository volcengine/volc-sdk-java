package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class OCRIDCardResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    IDCardData data;

    @Data
    public static class IDCardData {
        
        @JSONField(name = "card_front")
        FrontInfo frontInfo;

        @JSONField(name = "card_back")
        BackInfo backInfo;

        @JSONField(name = "card_corners")
        List<Integer> cardCorners;
    }

    @Data
    public static class FrontInfo {
        @JSONField(name = "name")
        String name;

        @JSONField(name = "gender")
        String gender;

        @JSONField(name = "ethnicity")
        String ethnicity;

        @JSONField(name = "data_of_birth")
        String dataOfBirth;

        @JSONField(name = "domicile")
        String domicile;

        @JSONField(name = "id_number")
        String idNumber;

        @JSONField(name = "face_corners")
        List<Integer> faceCorners;

        @JSONField(name = "card_corners")
        List<Integer> cardCorners;

        @JSONField(name = "card_img")
        String cardImg;

        @JSONField(name = "face_img")
        String faceImg;

        @JSONField(name = "card_type")
        String cardType;
    }

    @Data
    public static class BackInfo {
        @JSONField(name = "issue_authority")
        String issueAuthority;

        @JSONField(name = "valid_period")
        String validPeriod;

        @JSONField(name = "card_corners")
        List<Integer> cardCorners;

        @JSONField(name = "card_img")
        String cardImg;

        @JSONField(name = "card_type")
        String cardType;
    }
}