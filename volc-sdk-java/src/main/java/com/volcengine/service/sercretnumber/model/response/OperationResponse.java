package com.volcengine.service.sercretnumber.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class OperationResponse {

  @JSONField(name = "ResponseMetadata")
  private ResponseMetadata responseMetadata;

  private Boolean result;
}
