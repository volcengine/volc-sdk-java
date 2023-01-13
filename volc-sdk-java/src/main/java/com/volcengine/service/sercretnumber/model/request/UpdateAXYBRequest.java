package com.volcengine.service.sercretnumber.model.request;

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
public class UpdateAXYBRequest {

    private String updateType;

    private String numberPoolNo;

    private String subId;

    private String phoneNoB;

    private String phoneNoA;

    private String phoneNoX;

    private Long expireTime;

    private String userData;

    private Integer autoCreateFlag;
}
