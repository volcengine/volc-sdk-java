package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AudienceGroupUser;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListAudienceGroupUserResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListAudienceGroupUserBody result;

    @Data
    public static class ListAudienceGroupUserBody {
        @JSONField(name = "AudienceGroupUsers")
        List<AudienceGroupUser> AudienceGroupUsers;
        @JSONField(name = "TotalCount")
        Long TotalCount;
    }
}