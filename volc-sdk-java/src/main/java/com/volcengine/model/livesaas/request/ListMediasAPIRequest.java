package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ListMediasAPIRequest {
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "EndT")
    Long EndT;
    @JSONField(name = "PageNo")
    Integer PageNo;
    @JSONField(name = "PageItemCount")
    Integer PageItemCount;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "IsNeedTotalCount")
    Boolean IsNeedTotalCount;
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "OnlineStatus")
    Integer OnlineStatus;
}