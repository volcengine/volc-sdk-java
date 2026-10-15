package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CommonStatusBody {
    @JSONField(name = "Status")
    Boolean Status;
}
