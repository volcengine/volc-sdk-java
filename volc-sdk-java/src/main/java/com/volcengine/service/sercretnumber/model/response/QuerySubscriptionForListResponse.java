package com.volcengine.service.sercretnumber.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.sercretnumber.model.business.Subscription;
import java.util.List;
import lombok.Data;

@Data
public class QuerySubscriptionForListResponse {

  @JSONField(name = "ResponseMetadata")
  private ResponseMetadata responseMetadata;

  private SubscriptionList result;

  @Data
  public static class SubscriptionList {

    private List<Subscription> records;

    private Integer limit;

    private Long offset;

    private Long total;
  }
}
