package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXMirrorRequestHttpCodeByTimeReq {
    @JSONField(name = "ServiceIds")
    private List<String> serviceIds;  // 服务id过滤
    @JSONField(name = "DomainNames")
    private List<String> domainNames; // 域名过滤
    @JSONField(name = "AggregateCode")
    private String aggregateCode; // 状态码是否聚合。支持true,false。默认为false

    @JSONField(name = "StartTime")
    private String startTime;   // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "EndTime")
    private String endTime;     // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "Granularity")
    private String granularity; // 时间粒度。支持5m,1h,1d。不传默认查询时间段全部数据
}
