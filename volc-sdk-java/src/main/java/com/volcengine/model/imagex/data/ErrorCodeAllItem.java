package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ErrorCodeAllItem {
    @JSONField(name = "ErrorCode")
    private String errorCode;
    @JSONField(name = "ErrorCodeDesc")
    private String errorCodeDesc;
    @JSONField(name = "Isp")
    private String isp;
    @JSONField(name = "Domain")
    private String domain;
    @JSONField(name = "Region")
    private String region;
    @JSONField(name = "RegionType")
    private String regionType;
    @JSONField(name = "Value")
    private Long value;
    @JSONField(name = "Details")
    private List<ErrorCodeAllDetailsItem> details;
}
