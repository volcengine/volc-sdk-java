package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DomainInfo {
    @JSONField(name = "MainDomain")
    private String mainDomain;
    @JSONField(name = "BackupDomain")
    private String backupDomain;
}
