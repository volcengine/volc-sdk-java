package com.volcengine.service.live.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListVQScoreTaskRequest {

  @JSONField(name = "StartTime")
  private String StartTime;

  @JSONField(name = "EndTime")
  private String EndTime;

  @JSONField(name = "PageNum")
  private long PageNum;

  @JSONField(name = "PageSize")
  private long PageSize;

  @JSONField(name = "Status")
  private Integer Status;
}
