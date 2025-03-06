package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AwardUserInfo;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;
import java.util.List;

@Data
public class GetVipOrBlackListUserInfoResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata ResponseMetadata;
    @JSONField(name = "Result")
    Result Result;

    @Data
    public static class Result {
        @JSONField(name = "AwardUserInfoList")
        List<AwardUserInfo> AwardUserInfoList;
        @JSONField(name = "BlackUserInfoId")
        Long BlackUserInfoId;
        @JSONField(name = "Role")
        Integer Role;
        @JSONField(name = "UserCount")
        Integer UserCount;
        @JSONField(name = "VipUserInfoId")
        Long VipUserInfoId;
    }
}
