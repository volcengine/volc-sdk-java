package com.volcengine.model.beans.kms;

import com.alibaba.fastjson.annotation.JSONField;

public class Base {
    @JSONField(name = "Base")
    Base base;
    @JSONField(name = "CreationDate")
    int creationDate;
    @JSONField(name = "UpdateDate")
    int updateDate;
}


