package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class WebTracksRequest {
    @JSONField(serialize = false)
    String topicId;

    @JSONField(serialize = false)
    String projectId;

    @JSONField(serialize = false)
    String compressType;

    @JSONField(name = LOGS)
    List<Map<String, String>> logs;

    @JSONField(name = SOURCE)
    String source;
}
