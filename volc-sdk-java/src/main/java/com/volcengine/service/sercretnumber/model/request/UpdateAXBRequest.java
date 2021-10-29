package com.volcengine.service.sercretnumber.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAXBRequest {

  private String updateType;

  private String numberPoolNo;

  private String subId;

  private Long expireTime = -1L;

  private String phoneNoB;
}
