package com.volcengine.service.sercretnumber.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class SecretBindResponse {

  @JSONField(name = "ResponseMetadata")
  private ResponseMetadata responseMetadata;

  private SecretBindResult result;

  @Data
  public static class SecretBindResult {

    private String phoneNoX;

    private String subId;

    private Integer status;
  }
}
