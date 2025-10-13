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
    String application;
    @JSONField(name = "CreatedTime")
    long createTime;
    @JSONField(name = "IsOrder")
    Boolean isOrder;
    @JSONField(name = "Status")
    int status;
    @JSONField(name = "Reason")
    String reason;
    @JSONField(name = "OpenId")
    String openId;
    @JSONField(name = "UpdateStatus")
    String updateStatus;
}
