package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ArticleFeedRequest {
    @JSONField(name = "UniqUserId")
    String uniqUserId;
    @JSONField(name = "Category")
    String category;
    @JSONField(name = "Context")
    Context context;
    @JSONField(name = "PersonalRec")
    int personalRec;

    @Data
    public static class Context {
        @JSONField(name = "IP")
        String ip;
        @JSONField(name = "Province")
        String province;
        @JSONField(name = "RefreshType")
        String refreshType;
    }
}
