package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetAdvertisementDataDetailAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAdvertisementDataAPIV2ResponseBody result;

    @Data
    public static class GetAdvertisementDataAPIV2ResponseBody {
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "PageToken")
        String PageToken;
        @JSONField(name = "AdInfoDetails")
        List<AdInfoDetail> AdInfoDetails;
    }

    @Data
    public static class AdInfoDetail {
        @JSONField(name = "Title")
        String Title;
        @JSONField(name = "Content")
        String Content;
        @JSONField(name = "PageAdvertiseType")
        Integer PageAdvertiseType;
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "UserTel")
        String UserTel;
        @JSONField(name = "NickName")
        String NickName;
        @JSONField(name = "ClickTime")
        Long ClickTime;
        @JSONField(name = "ExternalUserId")
        String ExternalUserId;
        @JSONField(name = "Link")
        String Link;
    }
}
