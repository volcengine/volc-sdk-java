package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Organization {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "Name")
    String Name;
}