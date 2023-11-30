package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.QueryUid;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CheckUidMatchRequest {
    @JSONField(name = "QueryList")
    List<QueryUid> QueryList;
}