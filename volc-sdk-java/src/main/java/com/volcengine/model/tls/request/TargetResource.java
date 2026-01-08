package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TargetResource {
    @JSONField(name = "Alias")
    private String alias;

    @JSONField(name = "TopicId")
    private String topicId;

    @JSONField(name = "Region")
    private String region;

    @JSONField(name = "RoleTrn")
    private String roleTrn;
}
