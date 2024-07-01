package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateLiveChannelConfigRequest {

    @JSONField(name = "ActivityId")
    Long ActivityId;

    @JSONField(name = "LineName")
    String LineName;

    @JSONField(name = "CoverImage")
    String CoverImage;

    @JSONField(name = "Resolution")
    List<String> Resolution;

    @JSONField(name = "PCDefaultResolution")
    String PCDefaultResolution;

    @JSONField(name = "MobileDefaultResolution")
    String MobileDefaultResolution;

    @JSONField(name = "MainBackupType")
    Integer MainBackupType;

    @JSONField(name = "LlsType")
    Integer LlsType;

    @JSONField(name = "TimeShiftType")
    Integer TimeShiftType;

    @JSONField(name = "LineLanguage")
    String LineLanguage;
}