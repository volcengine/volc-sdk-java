package com.volcengine.service.sercretnumber.model.request;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SelectNumberAndBindAXBRequest {

  private String phoneNoA;

  private String phoneNoB;

  private String numberPoolNo;

  private Long expireTime;

  private Integer audioRecordFlag;

  private String cityCode;

  private String cityCodeByPhoneNo;

  private String degradeCityList;

  private String userData;

  private Integer randomFlag;
}
