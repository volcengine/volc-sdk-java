package com.volcengine.model.livesaas.request;

import com.volcengine.model.beans.livesaas.QueryVQUser;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetVQUserDataAPIRequest {
    @JSONField(name = "Users")
    List<QueryVQUser> Users;
    @JSONField(name = "DateTime")
    String DateTime;
}