package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class WapRegisterRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "Uuid")
    String uuid;
    @JSONField(name = "Ouid")
    String ouid;
    @JSONField(name = "Age")
    int age;
    @JSONField(name = "Gender")
    String gender;
    @JSONField(name = "Birth")
    int birth;
}
