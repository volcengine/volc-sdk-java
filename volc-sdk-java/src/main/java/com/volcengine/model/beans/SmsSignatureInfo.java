package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SmsSignatureInfo {
    @JSONField(name = "Id")
    String id;
    @JSONField(name = "ApplyId")
    String applyId;
    @JSONField(name = "Content")
    String content;
    @JSONField(name = "Source")
    String source;
    @JSONField(name = "Application")
    int application;
    @JSONField(name = "CreatedTime")
    boolean createTime;
    @JSONField(name = "IsOrder")
    String isOrder;
    @JSONField(name = "Status")
    int status;
    @JSONField(name = "Reason")
    ShortUrlConfig reason;
}
