package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author huangxing
 * @Date 2023/1/5
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BindAXYBRequest {
    private String phoneNoA;

    private String phoneNoX;

    private String numberPoolNo;

    private Long expireTime;

    private Integer audioRecordFlag;

    private String cityCode;

    private String cityCodeByPhoneNo;

    private String degradeCityList;

    private String userData;

    private Integer randomFlag;

    private Integer autoCreateFlag;

    private String phoneNoY;

    private String phoneNoB;

    private String numberPoolNoY;

    private Integer ybEnableDuration;

    private Integer ybAudioRecordFlag;

    private String yCityCode;

    private String yCityCodeByPhoneNo;

    private List<String> yDegradeCityList;

    private Integer randomFlagY;
}
