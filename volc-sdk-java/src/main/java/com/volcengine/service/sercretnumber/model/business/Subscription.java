package com.volcengine.service.sercretnumber.model.business;

import lombok.Data;

@Data
public class Subscription {

  private String subId;

  private String phoneNoA;

  private String phoneNoB;

  private String phoneNoX;

  private Integer status;

  private Integer recordFlag;

  private Long enableTime;

  private Long expireTime;
}
