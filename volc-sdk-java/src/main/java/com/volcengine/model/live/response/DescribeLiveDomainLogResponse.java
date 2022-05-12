package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveDomainLogResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeLiveDomainLogOutput Result;

    @Data
    public static class DescribeLiveDomainLogOutput {
        @JSONField(name = "List")
        private List<LiveDomainLogList> List;
        @JSONField(name = "Pagination")
        private Pagination Pagination;
    }

    @Data
    public static class Pagination {
        @JSONField(name = "PageCur")
        private int PageCur;
        @JSONField(name = "PageSize")
        private int PageSize;
        @JSONField(name = "TotalCount")
        private int TotalCount;
    }

    @Data
    public static class LiveDomainLogList {
        @JSONField(name = "Domain")
        private String Domain;
        @JSONField(name = "LogName")
        private String LogName;
        @JSONField(name = "LogSize")
        private int LogSize;
        @JSONField(name = "DateTime")
        private String DateTime;
        @JSONField(name = "CreatedAt")
        private String CreatedAt;
        @JSONField(name = "UpdatedAt")
        private String UpdatedAt;
        @JSONField(name = "DownloadUrl")
        private String DownloadUrl;
    }
}
