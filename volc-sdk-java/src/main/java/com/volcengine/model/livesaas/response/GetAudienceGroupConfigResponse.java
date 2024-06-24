package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetAudienceGroupConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAudienceGroupConfigBody result;

    @Data
    public static class AudienceGroupBasicInfoModel {
        @JSONField(name = "GroupId")
        Long GroupId;
        @JSONField(name = "GroupName")
        String GroupName;
        @JSONField(name = "TotalCount")
        Long TotalCount;
    }

    @Data
    public static class GetAudienceGroupConfigBody {
        @JSONField(name = "GroupType")
        Integer GroupType;
        @JSONField(name = "GroupEnableStatus")
        Integer GroupEnableStatus;
        @JSONField(name = "ViewPageShowGroupName")
        Integer ViewPageShowGroupName;
        @JSONField(name = "CannotWatchLiveWhenNotInGroup")
        Integer CannotWatchLiveWhenNotInGroup;
        @JSONField(name = "AudienceGroupsBasicInfo")
        List<AudienceGroupBasicInfoModel> AudienceGroupsBasicInfo;
    }
}