package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetVoteStatisticsAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetVoteStatisticsAPIResponseBody result;

    @Data
    public static class GetVoteStatisticsAPIResponseBody {
        @JSONField(name = "VoteStatisticsList")
        List<VoteStatisticsAPI> VoteStatisticsList;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageCount")
        Integer PageCount;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
    }

    @Data
    public static class VoteStatisticsAPI {
        @JSONField(name = "IP")
        String IP;
        @JSONField(name = "VoteTime")
        Long VoteTime;
        @JSONField(name = "UserID")
        Long UserID;
        @JSONField(name = "Email")
        String Email;
        @JSONField(name = "UserAgent")
        String UserAgent;
        @JSONField(name = "ExternalId")
        String ExternalId;
        @JSONField(name = "UserChose")
        List<VoteUserChose> UserChose;
        @JSONField(name = "UserName")
        String UserName;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "UserTel")
        String UserTel;
    }

    @Data
    public static class VoteUserChose {
        @JSONField(name = "OptionName")
        String OptionName;
        @JSONField(name = "OptionSite")
        String OptionSite;
    }
}