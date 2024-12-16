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
public class BindYBForAXYBRequest {
    private String parentSubId;

    private String phoneNoB;

    private String phoneNoY;

    private String numberPoolNo;

    private Integer enableDuration;

    private Integer audioRecordFlag;

    private String cityCode;

    private String cityCodeByPhoneNo;

    private String degradeCityList;

    private String userData;

    private Integer randomFlag;
}
