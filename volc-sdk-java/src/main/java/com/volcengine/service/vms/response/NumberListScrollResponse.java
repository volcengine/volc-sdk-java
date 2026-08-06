package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.vms.model.NumberListScroll;
import lombok.Data;

@Data
public class NumberListScrollResponse {

    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    private NumberListScroll result;
}
