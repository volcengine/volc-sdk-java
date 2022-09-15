package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class OCRDrivingLicenseResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    DrivingLicenseData data;

    @Data
    public static class DrivingLicenseData {
        
        @JSONField(name = "license_main")
        MainInfo licenseMain;
    }

    @Data
    public static class MainInfo {
        @JSONField(name = "id_number")
        String idNumber;

        @JSONField(name = "name")
        String name;

        @JSONField(name = "sex")
        String sex;

        @JSONField(name = "address")
        String address;

        @JSONField(name = "nationality")
        String nationality;

        @JSONField(name = "date_of_birth")
        String dateOfBirth;

        @JSONField(name = "date_of_first_issue")
        String dateOfFirstIssue;

        @JSONField(name = "class")
        String carClass;

        @JSONField(name = "valid_begin")
        String validBegin;

        @JSONField(name = "valid_end")
        String validEnd;
    }
}