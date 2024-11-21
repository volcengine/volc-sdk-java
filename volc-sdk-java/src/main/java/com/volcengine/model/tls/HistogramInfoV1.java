package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class HistogramInfoV1 {

    @JSONField(name = COUNT)
    long count;

    @JSONField(name = END_TIME)
    long endTime;

    @JSONField(name = START_TIME)
    long startTime;

    @JSONField(name = RESULT_STATUS)
    String resultStatus;

}