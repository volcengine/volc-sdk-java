package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListWaitLinkAudienceResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListWaitLinkAudienceResponseBody result;

    @Data
    public static class ListWaitLinkAudienceResponseBody {
        @JSONField(name = "AudienceList")
        List<ListWaitLinkAudience> AudienceList;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
    }

    @Data
    public static class ListWaitLinkAudience {
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "Nickname")
        String Nickname;
        @JSONField(name = "IsLinking")
        Integer IsLinking;
        @JSONField(name = "CreateTime")
        Long CreateTime;
    }
}
