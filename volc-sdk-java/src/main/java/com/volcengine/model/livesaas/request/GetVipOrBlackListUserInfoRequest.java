package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetVipOrBlackListUserInfoRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "KeyWord")
    String KeyWord;
    @JSONField(name = "PageNum")
    Integer PageNum;
    @JSONField(name = "PageSize")
    Integer PageSize;
}
