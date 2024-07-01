package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class CreateLiveChannelConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateLiveChannelConfigResponseBody result;

    @Data
    public static class UpdateLiveChannelConfigResponseBody {
        @JSONField(name = "ActivityId")
        Long ActivityId;

        @JSONField(name = "LineId")
        Long LineId;

        @JSONField(name = "LineIndex")
        Integer LineIndex;

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


}