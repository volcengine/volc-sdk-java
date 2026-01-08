package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class KafkaShipperInfo {

    /** 任务结束时间戳. */
    @JSONField(name = "EndTime")
    private long endTime;

    /** 压缩格式. */
    @JSONField(name = "Compress")
    private String compress;

    /** Kafka 实例. */
    @JSONField(name = "Instance")
    private String instance;

    /** 任务开始时间戳. */
    @JSONField(name = "StartTime")
    private long startTime;

    /** Kafka Topic 名称. */
    @JSONField(name = "KafkaTopic")
    private String kafkaTopic;
}
