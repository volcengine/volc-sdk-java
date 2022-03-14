package com.volcengine.model.beans.kms;

import com.alibaba.fastjson.annotation.JSONField;

public class Keyring {
    @JSONField(name = "Base")
    Base base;
    @JSONField(name = "KeyringName")
    String keyringName;
    @JSONField(name = "KeyringType")
    String keyringType;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "Uid")
    String uid;
}
