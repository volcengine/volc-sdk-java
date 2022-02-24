package com.volcengine.service.notify.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SingleResultItem {
    @JSONField(name = "Phone")
    private String phone;

    @JSONField(name = "SingleOpenId")
    private String singleOpenId;

    @JSONField(name = "Type")
    private String type;
}
