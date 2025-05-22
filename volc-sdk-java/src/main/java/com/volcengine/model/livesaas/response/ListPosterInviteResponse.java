package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListPosterInviteResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListPosterInviteBody result;

    @Data
    public static class ListPosterInviteBody {
        @JSONField(name = "InviteList")
        List<PosterInviteInfo> InviteList;
        @JSONField(name = "TotalItemCount")
        Integer TotalItemCount;
    }

    @Data
    public static class PosterInviteInfo {
        @JSONField(name = "ExternalUserId")
        String ExternalUserId;
        @JSONField(name = "Rank")
        Integer Rank;
        @JSONField(name = "InviterName")
        String InviterName;
        @JSONField(name = "InviteCount")
        Integer InviteCount;
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "UserTel")
        String UserTel;
        @JSONField(name = "InviterAvatar")
        String InviterAvatar;
    }
}