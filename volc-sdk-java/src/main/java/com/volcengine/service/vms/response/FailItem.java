package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class FailItem {
    @JSONField(name = "Index")
    private int index;

    @JSONField(name = "Phone")
    private String phone;

    @JSONField(name = "Type")
    private String type;
}


