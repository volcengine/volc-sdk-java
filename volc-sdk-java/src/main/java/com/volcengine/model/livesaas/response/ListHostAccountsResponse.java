package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.HostAccountInfo;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListHostAccountsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListHostAccountsResponseBody result;

    @Data
    public static class ListHostAccountsResponseBody {
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "TotalItemCount")
        Integer TotalItemCount;
        @JSONField(name = "GetFollowDataUrl")
        String GetFollowDataUrl;
        @JSONField(name = "UpdateFollowDataUrl")
        String UpdateFollowDataUrl;
        @JSONField(name = "HostAccounts")
        List<HostAccountInfo> HostAccounts;
    }
}
