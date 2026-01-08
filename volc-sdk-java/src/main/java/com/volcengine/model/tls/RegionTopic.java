package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.REGION;
import static com.volcengine.model.tls.Const.TOPIC;

@Data
@NoArgsConstructor
public class RegionTopic {

    @JSONField(name = REGION)
    private String region;

    @JSONField(name = TOPIC)
    private String topic;
}
