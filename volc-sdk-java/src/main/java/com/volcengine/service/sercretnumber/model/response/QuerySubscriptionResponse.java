package com.volcengine.service.sercretnumber.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.sercretnumber.model.business.Subscription;
import lombok.Data;

@Data
public class QuerySubscriptionResponse {

  @JSONField(name = "ResponseMetadata")
  private ResponseMetadata responseMetadata;

  private Subscription result;
}
