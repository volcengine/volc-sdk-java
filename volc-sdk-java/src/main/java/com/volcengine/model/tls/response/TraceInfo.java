package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TraceInfo 对应 SearchTraces 接口返回的单条 Trace 详情。
 */
@Data
@NoArgsConstructor
public class TraceInfo {

    /**
     * TraceID
     */
    @JSONField(name = "TraceId")
    private String traceId;

    /**
     * 服务名称
     */
    @JSONField(name = "ServiceName")
    private String serviceName;

    /**
     * 操作名称
     */
    @JSONField(name = "OperationName")
    private String operationName;

    /**
     * Attributes 中字段为 key，value 为该字段可能的取值
     */
    @JSONField(name = "Attributes")
    private java.util.Map<String, String> attributes;

    /**
     * 开始时间，单位为微秒
     */
    @JSONField(name = "StartTime")
    private Long startTime;

    /**
     * 结束时间，单位为微秒
     */
    @JSONField(name = "EndTime")
    private Long endTime;

    /**
     * Duration，单位为微秒
     */
    @JSONField(name = "Duration")
    private Long duration;

    /**
     * Trace 状态
     */
    @JSONField(name = "StatusCode")
    private String statusCode;
}
