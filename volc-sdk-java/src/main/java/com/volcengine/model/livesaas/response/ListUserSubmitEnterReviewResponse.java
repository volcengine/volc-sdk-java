package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListUserSubmitEnterReviewResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListUserSubmitEnterReviewBody result;

    @Data
    public static class ListUserSubmitEnterReviewBody {
        @JSONField(name = "PageCount")
        Integer PageCount;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "UserFormList")
        List<UserFormRecord> UserFormList;
        @JSONField(name = "PageNo")
        Integer PageNo;
    }

    @Data
    public static class UserFormRecord {
        @JSONField(name = "UserFormID")
        Long UserFormID;
        @JSONField(name = "EnterName")
        String EnterName;
        @JSONField(name = "EnterTel")
        String EnterTel;
        @JSONField(name = "ReviewStatus")
        Integer ReviewStatus;
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "NickName")
        String NickName;
        @JSONField(name = "EnterTime")
        Long EnterTime;
    }
}