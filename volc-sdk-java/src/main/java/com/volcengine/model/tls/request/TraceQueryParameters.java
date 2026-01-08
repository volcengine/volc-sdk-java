package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class TraceQueryParameters {
    @JSONField(name = "Asc")
    private Boolean asc;
    
    @JSONField(name = "Kind")
    private String kind;
    
    @JSONField(name = "Limit")
    private Integer limit;
    
    @JSONField(name = "Order")
    private String order;
    
    @JSONField(name = "Offset")
    private Integer offset;
    
    @JSONField(name = "TraceId")
    private String traceId;
    
    @JSONField(name = "Attributes")
    private Map<String, Object> attributes;
    
    @JSONField(name = "StatusCode")
    private String statusCode;
    
    @JSONField(name = "DurationMax")
    private Long durationMax;
    
    @JSONField(name = "DurationMin")
    private Long durationMin;
    
    @JSONField(name = "ServiceName")
    private String serviceName;
    
    @JSONField(name = "StartTimeMax")
    private Long startTimeMax;
    
    @JSONField(name = "StartTimeMin")
    private Long startTimeMin;
    
    @JSONField(name = "OperationName")
    private String operationName;
}