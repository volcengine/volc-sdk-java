package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;
import java.util.List;
import com.volcengine.model.beans.livesaas.ErrorAwardUserInfo;

@Data
public class CreateVipOrBlackListUserInfoResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata ResponseMetadata;
    @JSONField(name = "Result")
    Result Result;

    @Data
    public static class Result {
        @JSONField(name = "BlackUserInfoId")
        Long BlackUserInfoId;
        @JSONField(name = "VipUserInfoId")
        Long VipUserInfoId;
        @JSONField(name = "ErrorUserList")
        List<ErrorAwardUserInfo> ErrorUserList;
    }
}
