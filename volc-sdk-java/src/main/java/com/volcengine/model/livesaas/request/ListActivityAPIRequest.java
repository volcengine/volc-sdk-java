package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.SiteActivityTagNew;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityAPIRequest {
    @JSONField(name = "HostAccountName")
    String HostAccountName;
    @JSONField(name = "PageNo")
    Integer PageNo;
    @JSONField(name = "SiteTagNews")
    List<SiteActivityTagNew> SiteTagNews;
    @JSONField(name = "PageItemCount")
    Integer PageItemCount;
    @JSONField(name = "LiveTime")
    Long LiveTime;
    @JSONField(name = "IsLockPreview")
    Integer IsLockPreview;
    @JSONField(name = "HostAccountId")
    Long HostAccountId;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "Status")
    Integer Status;
}