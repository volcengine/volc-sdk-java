package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class QueryVQUser {
    @JSONField(name = "Uid")
    String Uid;
    @JSONField(name = "Nickname")
    String Nickname;
    @JSONField(name = "Source")
    String Source;
}