package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class EnableActivityMultiProductExplainRequest {
    @JSONField(name="ActivityId")
    Long ActivityId;
    @JSONField(name="IsMultiProductExplainEnable")
    Integer IsMultiProductExplainEnable;
}
