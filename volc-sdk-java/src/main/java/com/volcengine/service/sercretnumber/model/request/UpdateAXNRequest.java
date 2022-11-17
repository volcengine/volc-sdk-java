package com.volcengine.service.sercretnumber.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAXNRequest {

  private String updateType;

  private String numberPoolNo;

  private String subId;

  private Long expireTime = -1L;

  private String phoneNoA;

  private String phoneNoB;

  private String phoneNoX;

  private String idempotentId;

  private String userData;

  private Integer autoCreateFlag = -1;

  public String outId;
}
