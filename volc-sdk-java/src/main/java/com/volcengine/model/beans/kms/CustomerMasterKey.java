package com.volcengine.model.beans.kms;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.util.Time;

public class CustomerMasterKey {
    @JSONField(name = "Base")
    Base base;
    @JSONField(name = "KeyName")
    String keyName;
    @JSONField(name = "KeySpec")
    String keySpec;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "KeyState")
    String keyState;
    @JSONField(name = "KeyUsage")
    String keyUsage;
    @JSONField(name = "ProtectionLevel")
    String protectionLevel;
    @JSONField(name = "ScheduleDeleteTime")
    Time ScheduleDeleteTime;
}
