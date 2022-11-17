package com.volcengine.service.sercretnumber.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SelectNumberAndBindAXNRequest {

  private String phoneNoA;

  private String phoneNoB;

  private String numberPoolNo;

  private Long expireTime;

  private Integer audioRecordFlag;

  private Integer callDisplayType;

  private String cityCode;

  private String cityCodeByPhoneNo;

  private String degradeCityList;

  private String userData;

  private String idempotentId;

  private Integer randomFlag;

  public String outId;
}
