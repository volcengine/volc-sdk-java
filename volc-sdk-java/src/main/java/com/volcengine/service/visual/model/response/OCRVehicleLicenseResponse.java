package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class OCRVehicleLicenseResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    VehicleLicenseData data;

    @Data
    public static class VehicleLicenseData {
        
        @JSONField(name = "license_main")
        MainInfo licenseMain;
    }

    @Data
    public static class MainInfo {
        @JSONField(name = "plate_number")
        String plateNumber;

        @JSONField(name = "vehicle_type")
        String vehicleType;

        @JSONField(name = "owner")
        String owner;

        @JSONField(name = "address")
        String address;

        @JSONField(name = "use_character")
        String useCharacter;

        @JSONField(name = "model")
        String model;

        @JSONField(name = "vin")
        String vin;

        @JSONField(name = "engine_number")
        String engineNumber;

        @JSONField(name = "register_date")
        String registerDate;

        @JSONField(name = "issue_date")
        String issueDate;
    }
}