package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huangxing
 * @Date 2023/1/5
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BindAXNERequest {
    private String phoneNoA;

    private String phoneNoB;

    private String phoneNoX;

    private String phoneNoE;

    private String numberPoolNo;

    private Long expireTime;

    private Integer audioRecordFlag;

    private String cityCode;

    private String cityCodeByPhoneNo;

    private String degradeCityList;

    private String userData;

    private String outId;

    private Integer randomFlag;

    private Integer autoCreateFlag;

    private String axbNumberPoolNo;

    private Integer axbEnableDuration;

    private Integer axbAudioRecordFlag;

    private String axbCityCode;

    private String axbCityCodeByPhoneNo;

    private String axbDegradeCityList;
}
