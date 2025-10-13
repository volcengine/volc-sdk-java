package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetSignatureAndOrderListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "List")
        List<GetSignatureAndOrderListResponse.SignAndOrderInfo> list;
        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class SignAndOrderInfo {
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "ApplyId")
        String applyId;
        @JSONField(name = "Content")
        String content;
        @JSONField(name = "Source")
        String source;
        @JSONField(name = "Application")
        String application;
        @JSONField(name = "CreatedTime")
        long createTime;
        @JSONField(name = "IsOrder")
        Boolean isOrder;
        @JSONField(name = "Status")
        int status;
        @JSONField(name = "Reason")
        String reason;
        @JSONField(name = "OpenId")
        String openId;
        @JSONField(name = "UpdateStatus")
        String updateStatus;

        @JSONField(name = "IsCommonSign")
        Boolean isCommonSign;
        @JSONField(name = "SubAccounts")
        List<String> subAccounts;
        @JSONField(name = "ChannelTypes")
        List<String> channelTypes;
        @JSONField(name = "Industry")
        String industry;
        @JSONField(name = "IndustryCN")
        String industryCN;
        @JSONField(name = "Usable")
        Boolean usable;
        @JSONField(name = "ReportStatus")
        ReportStatus reportStatus;
        @JSONField(name = "AuditedAt")
        int auditedAt;
    }

    @Data
    public static class ReportStatus {
        @JSONField(name = "Status")
        Integer status;

        @JSONField(name = "Cmcc")
        CMCC cmcc;

        @JSONField(name = "Ct")
        CT ct;

        @JSONField(name = "Unicom")
        UniCom unicom;
    }

    @Data
    public static class CMCC {
        @JSONField(name = "Status")
        Integer status;

        @JSONField(name = "Reason")
        String reason;
    }

    @Data
    public static class CT {
        @JSONField(name = "Status")
        Integer status;

        @JSONField(name = "Reason")
        String reason;
    }

    @Data
    public static class UniCom {
        @JSONField(name = "Status")
        Integer status;

        @JSONField(name = "Reason")
        String reason;
    }
}
