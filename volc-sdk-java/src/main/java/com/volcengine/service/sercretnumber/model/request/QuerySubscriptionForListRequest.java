package com.volcengine.service.sercretnumber.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuerySubscriptionForListRequest {

  private String numberPoolNo;

  private String phoneNoX;

  private String phoneNoA;

  private String phoneNoB;

  private Integer status;

  private String subId;

  private Integer Offset;

  private Integer limit;
}
