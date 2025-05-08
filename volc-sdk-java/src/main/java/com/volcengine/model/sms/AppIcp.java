package com.volcengine.model.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class AppIcp {
    @JSONField(name = "appIcpFileList")
    public List<SignAuthFile> appIcpFileList;
    @JSONField(name = "appIcpFilling")
    public String appIcpFilling;

    public AppIcp() {

    }

    public AppIcp(String appIcpFilling, List<SignAuthFile> appIcpFileList) {
        this.appIcpFilling = appIcpFilling;
        this.appIcpFileList = appIcpFileList;
    }
}
