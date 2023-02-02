package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetVoteListAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetVoteListAPIResponseBody result;

    @Data
    public static class GetVoteListAPIResponseBody {
        @JSONField(name = "VoteList")
        List<VoteConfigAPI> VoteList;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageCount")
        Integer PageCount;
    }

    @Data
    public static class VoteConfigAPI {
        @JSONField(name = "ChoiceType")
        String ChoiceType;
        @JSONField(name = "Deadline")
        Long Deadline;
        @JSONField(name = "Status")
        String Status;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "VoteId")
        String VoteId;
        @JSONField(name = "Title")
        String Title;
        @JSONField(name = "TotalCount")
        Long TotalCount;
    }

    @Data
    public static class VoteOption {
        @JSONField(name = "OptionPercent")
        String OptionPercent;
        @JSONField(name = "OptionSite")
        String OptionSite;
        @JSONField(name = "OptionName")
        String OptionName;
        @JSONField(name = "OptionCount")
        Long OptionCount;
    }
}