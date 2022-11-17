package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateDownloadTaskRequest {
    @JSONField(name = TASK_NAME)
    String taskName;

    @JSONField(name = TOPIC_ID)
    String topicId;

    @JSONField(name = QUERY)
    String query;

    @JSONField(name = START_TIME)
    BigInteger startTime;

    @JSONField(name = END_TIME)
    BigInteger endTime;

    @JSONField(name = DATA_FORMAT)
    String dataFormat;

    @JSONField(name = SORT)
    String sort;

    @JSONField(name = LIMIT)
    Integer limit;

    @JSONField(name = COMPRESSION)
    String compression;
}
