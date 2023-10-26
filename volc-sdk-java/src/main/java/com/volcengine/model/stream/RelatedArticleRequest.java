package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RelatedArticleRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Count")
    String count;
    @JSONField(name = "GroupId")
    String groupId;
    @JSONField(name = "Os")
    String os;
    @JSONField(name = "ClientVersion")
    String clientVersion;
    @JSONField(name = "NeedVideoDetail")
    String needVideoDetail;
}
