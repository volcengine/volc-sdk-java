package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class GetAccountTemplateAPIRequest {
    @JSONField(name = "FollowerUserName")
    String FollowerUserName;
    @JSONField(name = "Keyword")
    String Keyword;
    @JSONField(name = "PageNo")
    Integer PageNo;
    @JSONField(name = "PageItemCount")
    Integer PageItemCount;
    @JSONField(name = "Status")
    Integer Status;
}